
package universidad_grupo_63.accesoADatos;

// import org.mariadb.jdbc.Connection;
// import java.sql.*; CON EL ASTERISCO IMPORTA EL PAQUETE COMPLETO DE SQL
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Conexion {
    
    // LOCALIZACIÓN DE LA BASE DE DATOS
    // localhost QUIERE DECIR QUE ESTÁ DE MANERA LOCAL EN MI COMPUTADORA
    // final SE USA PARA CONSTANTES
    private static final String URL="jdbc:mariadb://localhost/";
    // NOMBRE DE BASE DE DATOS
    private static final String DB="universidad_grupo_63";
    // NOMBRE DE USUARIO DE LA BASE DE DATOS DE MYSQL ES POR DEFECTO root
    private static final String USUARIO="root";
    // LA CONTRASEÑA ES UNA CADENA VACÍA
    private static final String PASSWORD="";
    // VARIABLE Connection PARA ESTABLECER LA CONEXIÓN
    // ES PARA ENVIAR SENTENCIAS SQL A LA BASE DE DATOS
    // SE IMPORTA EL PAQUETE
    private static Connection connection;
    
    
    // SE CREA CONSTRUCTOR PRIVADO
    // SI TENÉS UN CONSTRUCTOR PRIVADO NO PODÉS INSTANCIAR OBJETOS DE ESA CLASE
    
    private Conexion() {}
    
    // LOS MÉTODOS DE ACÁ TIENEN QUE SER ESTÁTICOS PARA QUE YO LOS PUEDA USAR DESDE AFUERA
    
    public static Connection getConexion() {
       
        // HAY QUE CARGAR LOS DRIVERS Y ESTABLECER LA CONEXIÓN A LA BASE DE DATOS
        
        // SI connection=null ES LA PRIMERA VEZ QUE SE VA A HACER LA CONEXIÓN
        
        if (connection==null) {
            try {
                // CARGA DE DRIVERS
                // ENTRE () UBICACIÓN DEL DRIVER
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado con éxito");
                
            } catch (ClassNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
       return connection;
    }
    
    
}
