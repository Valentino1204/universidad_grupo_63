package universidad_grupo_63.accesoADatos;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_63.entidades.Materia;

public class MateriaData {

    PreparedStatement ps = null; // SE COMUNICA CON LA BASE DATOS

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
        //JOptionPane.showMessageDialog(null, "El id generado para la materia es: "+materia.getIdMateria());
    }

    // MÉTODO MODIFICAR MATERIA
    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombreMateria=?, anio=? "
                + "WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());

            int exito = ps.executeUpdate(); // SE RETORNAN MODIFICACIONES HECHA A MATERIA Y SE DEVUELVE EN UNA VARIABLE LLAMADA exito

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    // MÉTODO CAMBIAR ESTADO MATERIA (ACTIVAR/DESACTIVAR)
    
    public void cambiarEstadoMateria(Materia materia) {

        int id = materia.getIdMateria();

        String sql = "UPDATE materia SET estadoMateria=? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, !materia.isEstadoMateria());
            ps.setInt(2, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                if (materia.isEstadoMateria()) {
                    JOptionPane.showMessageDialog(null, "Materia desactivada");
                } else {
                    JOptionPane.showMessageDialog(null, "Materia activada");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

    }
    
    // MÉTODO BUSCAR MATERIA
    
    public Materia buscarMateria (int id) {
        
        String sql = "SELECT nombreMateria, anio FROM materia WHERE idMateria = ? AND estadoMateria=1";
        
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet resultado = ps.executeQuery();
             
           if (resultado.next()) { 
                
                materia = new Materia(); 
                
                materia.setIdMateria(id); 
                materia.setNombreMateria(resultado.getString("nombreMateria"));
                materia.setAnio(resultado.getInt("anio"));
                materia.setEstadoMateria(true);
                
            } else {
                JOptionPane.showMessageDialog(null,"No existe una materia con ese id");
            }
            ps.close();
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materia;
    }
    
    // MÉTODO BUSCAR MATERIA POR NOMBRE
    
    public Materia buscarMateriaNombre (String nombremat) {
        
        String sql = "SELECT idMateria, anio FROM materia WHERE nombreMateria = ? AND estadoMateria=1";
        
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, nombremat);
            
            ResultSet resultado = ps.executeQuery();
             
           if (resultado.next()) { 
                
                materia = new Materia(); 
                
                materia.setNombreMateria(nombremat);
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setAnio(resultado.getInt("anio"));
                materia.setEstadoMateria(true);
                
            } else {
                JOptionPane.showMessageDialog(null,"No existe una materia con ese nombre");
            }
            ps.close();
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materia;
    }
    
    
    // MÉTODO BUSCAR MATERIA POR AÑO
    
    public Materia buscarMateriaAnio (int aniomat) {
        
        String sql = "SELECT idMateria, nombreMateria FROM materia WHERE anio = ? AND estadoMateria=1";
        
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, aniomat);
            
            ResultSet resultado = ps.executeQuery();
             
           if (resultado.next()) { 
                
                materia = new Materia(); 
                
                materia.setAnio(aniomat);
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombreMateria(resultado.getString("nombreMateria"));
                materia.setEstadoMateria(true);
                
            } else {
                JOptionPane.showMessageDialog(null,"No existe una materia con ese año");
            }
            ps.close();
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materia;
    }
    
    // MÉTODO LISTAR MATERIAS
    
    public ArrayList<Materia> listarMaterias(){
        
        String sql = "SELECT idMateria, nombreMateria, anio FROM materia WHERE estadoMateria=1";
        
        ArrayList<Materia> listaMaterias = new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombreMateria(rs.getString("nombreMateria"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstadoMateria(true);
                
                listaMaterias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        
        return listaMaterias;
        
    } 

}
