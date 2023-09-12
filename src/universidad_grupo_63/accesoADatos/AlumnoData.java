
package universidad_grupo_63.accesoADatos;

import java.sql.*;
//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
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
    
    public void cambiarEstadoAlumno (Alumno alumno) {
        
        int id = alumno.getIdAlumno();
      
        String sql = "UPDATE alumno SET estado=? WHERE idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, !alumno.isEstadoAlumno());
            //ps.setInt(1,id);
            int exito = ps.executeUpdate();
            
            if (exito==1) {
                if(alumno.isEstadoAlumno()){
                    JOptionPane.showMessageDialog(null,"Alumno Activado");
                }else{
                    JOptionPane.showMessageDialog(null,"Alumno Desactivado");
                }
           
            } 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
}
