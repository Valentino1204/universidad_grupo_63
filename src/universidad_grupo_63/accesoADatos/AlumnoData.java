
package universidad_grupo_63.accesoADatos;

import java.sql.*;
//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_63.entidades.Alumno;
//import org.mariadb.jdbc.Connection;


public class AlumnoData {
    PreparedStatement ps=null;
    // SE CREA UN OBJETO DE TIPO Connection QUE ES EL QUE VAN A USAR TODOS LOS MÉTODOS DE LA CLASE DATA
    private Connection con = null;
    
    // CONSTRUCTOR DE AlumnoData PARA QUE INICIALICE LA VARIABLE Connection
    
    public AlumnoData() {
        
        // ESTE MÉTODO CARGA LOS DRIVERS Y ESTABLECE LA CONEXIÓN A LA BASE DE DATOS universidad_grupo_63
        // ESTE MÉTODO ESTÁ EN LA CLASE Conexion
        con = Conexion.getConexion();
        
    }
    
    
    
    // MÉTODO GUARDAR ALUMNO
    
    // HACER UN INSERT EN LA TABLA ALUMNO
    
    public void guardarAlumno(Alumno alumno) {
        
        // ID DE ALUMNO NO SE PONE PORQUE ES AUTOINCREMENTAL, LO GENERA AUTOMÁTICAMENTE LA BASE DE DATOS
        // DENTRO DEL PARÉNTESIS VAN LAS COLUMNAS DE LA TABLA alumno EXACTAMENTE IGUAL COMO EN LA BASE DE DATOS
        String sql = "INSERT INTO alumno(nombre, apellido, dni, fechaNacimiento, estadoAlumno)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        try {
            // RETURN_GENERATED_KEYS PARA QUE DEVUELVA LAS CLAVES GENERADAS POR LOS ALUMNOS
            // ES DECIR LOS ID ALUMNO (AUTOINCREMENTALES)
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getDni());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstadoAlumno());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys(); // ESA LLAVE GENERADA GeneratedKey SE GUARDA EN UNA POSICIÓN DE LA LISTA LLAMADA rs
            
            // LAS FILAS CORRESPONDEN A LA CANTIDAD DE ALUMNOS INSERTADOS
            
            if(rs.next()){ // ResultSet ES UNA LISTA, PARA RECORRERLA USAS rs.next()
                
                // LE PONE EL ID AL ALUMNO EN JAVA
                // EL VALOR DE IdAlumno LO GUARDA EN EL OBJETO QUE CREASTE DE LA CLASE Alumno
                alumno.setIdAlumno(rs.getInt(1)); // UNA TABLA CON UNA SOLA COLUMNA QUE ES LA DE IdAlumno
                JOptionPane.showMessageDialog(null, "Alumno guardado");
                
            }
            ps.close();
            
        } catch (SQLException ex) { // EL MÉTODO PreparedStatement PUEDE LANZAR UNA SQLException
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
    
    // MODIFICAR ALUMNO
    
    public void modificarAlumno (Alumno alumno) {
        
       
        
        String sql = "UPDATE alumno SET nombre=?, apellido=?, dni=?, fechaNacimiento=?"
           + "WHERE idAlumno=?";     
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getDni());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate(); // SE RETORNAN MODIFICACIONES HECHA A ALUMNO Y SE DEVUELVE EN UNA VARIABLE LLAMADA exito
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Alumno modificado");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
    
    // CAMBIO ESTADO ALUMNO (ACTIVARLO/DESACTIVARLO)
    
    public void cambiarEstadoAlumno (int id) {
        
        //int id = alumno.getIdAlumno(); //AL OBJETO ALUMNO LE EXTRAES IdAlumno Y LO GUARDAS EN LA VARIABLE id
      
        Alumno alumno = buscarAlumno(id);
        
        String sql = "UPDATE alumno SET estadoAlumno=? WHERE idAlumno=?"; // SETEAS EL ESTADO PARA EL IdAlumno SELECCIONADO
        
        try {
            PreparedStatement ps = con.prepareStatement(sql); // MEDIANTE LA CONEXIÓN MANDA LA SENTENCIA A SQL
            ps.setBoolean(1, !alumno.isEstadoAlumno()); // EN EL ÍNDICE SELECCIONADO GUARDAS EL OPUESTO AL ESTADO ACTUAL
            // SE GUARDA EL ESTADO EN EL PRIMER SIGNO DE PREG
            ps.setInt(2,id); // SE GUARDA EL ID EN EL SIGUIENTE SIGNO DE PREG DE LA LÍNEA String sql
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                if(alumno.isEstadoAlumno()){
                    JOptionPane.showMessageDialog(null,"Alumno Desactivado");
                }else{
                    JOptionPane.showMessageDialog(null,"Alumno Activado");
                }
           
            } 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
    
    // BUSCAR ALUMNO POR ID
    
    public Alumno buscarAlumno(int id) {
        
        String sql = "SELECT nombre, apellido, dni, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estadoAlumno=1 ";
      
        Alumno alumno = null; // CREA LA VARIABLE DE TIPO ALUMNO VACÍA
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id); // REEMPLAZA EL SIGNO DE PREGUNTA POR EL id
            
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) { // AL if ENTRA CUANDO HAY UN ALUMNO CON ESE idAlumno
                
                alumno = new Alumno(); // CONSTRUCTOR VACÍO
                
                alumno.setIdAlumno(id); // ESTE ATRIBUTO YA LO PASASTE POR PARÁMETRO AL MÉTODO
                alumno.setEstadoAlumno(true);
                // SE EXTRAEN DE LA CONSULTA executeQuery LOS VALORES DE LAS COLUMNAS QUE SE GUARDAN EN LA VARIBLE resultado POR SEPARADO
                alumno.setNombre(resultado.getString("nombre")); 
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setDni(resultado.getInt("dni")); // getInt TIPO DE DATO Y "dni" NOMBRE DE COLUMNA
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());// EN LA BASE DE DATOS LA COLUMNA ES DE TIPO Date Y LO CONVIERTE A LocalDate EN JAVA CON EL MÉTODO toLocalDate()
                
            } else {
                JOptionPane.showMessageDialog(null,"No existe un alumno con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }
    
    // BUSCAR ALUMNO POR DNI
    
     public Alumno buscarAlumnoPorDni(int dni) {
        
        String sql = "SELECT idAlumno, nombre, apellido, fechaNacimiento FROM alumno WHERE dni = ? AND estadoAlumno=1 ";
      
        Alumno alumno = null; // CREA LA VARIABLE DE TIPO ALUMNO VACÍA
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni); // REEMPLAZA EL SIGNO DE PREGUNTA POR EL dni
            
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) { // AL if ENTRA CUANDO HAY UN ALUMNO CON ESE dni
                
                alumno = new Alumno(); // CONSTRUCTOR VACÍO
                
                alumno.setIdAlumno(resultado.getInt("idAlumno")); // ESTE ATRIBUTO YA LO PASASTE POR PARÁMETRO AL MÉTODO
                alumno.setEstadoAlumno(true);
                // SE EXTRAEN DE LA CONSULTA executeQuery LOS VALORES DE LAS COLUMNAS QUE SE GUARDAN EN LA VARIBLE resultado POR SEPARADO
                alumno.setNombre(resultado.getString("nombre")); 
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setDni(dni); // getInt TIPO DE DATO Y "dni" NOMBRE DE COLUMNA
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());// EN LA BASE DE DATOS LA COLUMNA ES DE TIPO Date Y LO CONVIERTE A LocalDate EN JAVA CON EL MÉTODO toLocalDate()
                
            } else {
                JOptionPane.showMessageDialog(null,"No existe un alumno con ese dni");
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }
    
    // LISTAR ALUMNOS
     
     public ArrayList<Alumno> listarAlumnos(){ // NO DEVUELVE UN ÚNICO ALUMNO, DEVUELVE UNA LISTA DE ALUMNOS
         
         String sql = "SELECT idAlumno, nombre, apellido, dni, fechaNacimiento FROM alumno WHERE estadoAlumno=1 ";
         
         ArrayList<Alumno> listaAlumnos = new ArrayList<>(); // INICIALIZACIÓN DE LA ArrayList
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){ // EN CADA VUELTA DEL BUCLE SE CREA UN ALUMNO Y SE LE SETEAN LOS DATOS
                Alumno alumno = new Alumno(); // CREACIÓN DE ALUMNO VACÍO PARA SETEARLE LOS SIGUIENTES VALORES
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstadoAlumno(true);
                
                listaAlumnos.add(alumno); // PONE LOS ALUMNOS CON SUS DATOS EN UNA LISTA
            }
            
            ps.close(); // CIERRA LA CONSULTA 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
         
          return listaAlumnos;
     }
     
}
