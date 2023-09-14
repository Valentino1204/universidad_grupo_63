
package universidad_grupo_63.accesoADatos;

import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_63.entidades.Materia;


public class MateriaData {
    
    PreparedStatement ps=null; // SE COMUNICA CON LA BASE DATOS
    
    private Connection con = null; // GENERA CONEXIÓN CON LA BASE DE DATOS
    
    public MateriaData() {
        con = Conexion.getConexion(); // LAMA AL MÉTODO PARA HACER LA CONEXIÓN
    }
    
    // MÉTODO GUARDAR MATERIA
    
    public void guardarMateria(Materia materia) {
       
         String sql = "INSERT INTO materia(nombreMateria, anio, estadoMateria)"
                + "VALUES(?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstadoMateria());
            
            ps.executeUpdate(); // EJECUTA LA SENTENCIA
            
            ResultSet rs = ps.getGeneratedKeys(); // TRAE DE ESA EJECUCIÓN LAS CLAVES GENERADAS Y LAS GUARDA EN rs
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        JOptionPane.showMessageDialog(null, "El id generado para la materia es: "+materia.getIdMateria());
    }
    
    // MÉTODO MODIFICAR MATERIA
    
    public void modificarMateria(Materia materia){
        
        String sql = "UPDATE materia SET nombreMateria=?, anio=?"
           + "WHERE idMateria=?"; 
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
             ps.setString(1, materia.getNombreMateria());
             ps.setInt(2, materia.getAnio());
             
            int exito = ps.executeUpdate(); // SE RETORNAN MODIFICACIONES HECHA A MATERIA Y SE DEVUELVE EN UNA VARIABLE LLAMADA exito
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Materia modificada");
            }    
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }  
    }
    
    // MÉTODO CAMBIAR ESTADO MATERIA (ACTIVAR/DESACTIVAR)
    
   
    
}
