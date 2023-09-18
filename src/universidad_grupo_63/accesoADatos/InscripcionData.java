
package universidad_grupo_63.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_63.entidades.Alumno;
import universidad_grupo_63.entidades.Inscripcion;
import universidad_grupo_63.entidades.Materia;
//import java.sql.Connection;

public class InscripcionData {
    
    private Connection con=null; // SE INICIALIZA LA CONEXIÓN
    
    private AlumnoData alumnoData = new AlumnoData();
    private MateriaData materiaData = new MateriaData();
            
    
    public InscripcionData(){ // CONSTRUCTOR
        
        this.con= Conexion.getConexion(); // SE LLENA LA VARIABLE CON EL MÉTODO QUE CARGA LOS DRIVERS Y ESTABLECE LA CONEXIÓN
        
    }
    
    // MÉTODO GUARDAR INSCRIPCIÓN
    
    public void guardarInscripcion(Inscripcion insc) {
        
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria) VALUES (?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            //ps.setFloat(1, insc.getNota());
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){ 
                insc.setIdInscripcion(rs.getInt(1)); // EL 1 HACE REFERENCIA A idInscripcion
                JOptionPane.showMessageDialog(null, "Inscripción guardada");
            }
            
            ps.close();
            
        /* Control de excepcion por inscripciones duplicadas
            
        } catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "No se pudo inscribir");
        */
        } catch (SQLException ex) {
            if(ex.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null,"Inscripcion Duplicada");
            }else{
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
            }
        }
        
    }
    
    // MÉTODO ACTUALIZAR NOTA
    
    public void actualizarNota (int id, float nota) {
        
        String sql = "UPDATE inscripcion SET nota = ? WHERE idInscripcion = ?"; // DE LA TABLA inscripcion QUE ACTUALICE LA nota
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, nota); // RELLENA SENTENCIA SQL nota=?
            // RELLENA SENTENCIA SQL idInscripcion=?
            ps.setInt(2, id); // ELIGE A QUE idInscripcion LE CAMBIA LA NOTA
            
            int exito = ps.executeUpdate(); // SE REALIZA LA EJECUCIÓN DE LA SENTENCIA SQL Y SE GUARDA EL RESULTADO DE LA EJECUCIÓN
            // EL MÉTODO executeUpdate RETORNA UN VALOR ENTERO Y LO GUARDA EN LA VARIABLE exito
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }  
    }
    
    // MÉTODO OBTENER INSCRIPCIONES
    
    public ArrayList<Inscripcion> obtenerInscripciones() {
        
        String sql = "SELECT * FROM inscripcion";
        
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery(); // MATRIZ CON COLUMNAS DE LA TABLA Y FILAS SEGÚN CANT DE INSCS
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getFloat("nota"));
                Alumno alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno); // SE SETEA EL VALOR GUARDADO DE alumno
                Materia materia = materiaData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                
                listaInscripciones.add(inscripcion);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción"); 
        }
        
        return listaInscripciones;
    }
    
    // MÉTODO BORRAR INSCRIPCIÓN MATERIA ALUMNO
    
    public void borrarInscripcionMateriaAlumno (int idInscripcion) {
        
        String sql = "DELETE FROM inscripcion WHERE idInscripcion = ? ";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idInscripcion);
            int exito = ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
    }
    
    
    
}
