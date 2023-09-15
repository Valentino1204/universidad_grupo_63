
package universidad_grupo_63.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_63.entidades.Inscripcion;
//import java.sql.Connection;

public class InscripcionData {
    
    private Connection con=null; // SE INICIALIZA LA CONEXIÓN
    
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
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
        
        
    }
    
    
    
}
