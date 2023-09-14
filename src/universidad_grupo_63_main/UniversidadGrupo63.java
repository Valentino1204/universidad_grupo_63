
package universidad_grupo_63_main;

import java.sql.Connection;
import java.time.LocalDate;
import universidad_grupo_63.accesoADatos.AlumnoData;
import universidad_grupo_63.accesoADatos.Conexion;
import universidad_grupo_63.entidades.Alumno;


public class UniversidadGrupo63 {

    
    public static void main(String[] args) {
        
       // PARA SABER SI FUNCIONA LA CONEXIÓN
       //Connection con = Conexion.getConexion();
       // PONÉS EN EL TECLADO SHIFT + F6 Y NO TENDRÍA QUE DAR ERROR
       
       AlumnoData alu = new AlumnoData();
       
       //-------------------------------------------------------------
       
       // AGREGAR ALUMNO
       
       /*
       
       Alumno alumno = new Alumno("Valentino", "Bulgarelli", 666666, LocalDate.of(2002, 9, 2), true);
         
       alu.guardarAlumno(alumno);
       
       */
       
       //-------------------------------------------------------------
       
       // MODIFICAR ALUMNO
       
       /*
       
       Alumno alumno = new Alumno(1, "Carlos", "Ridao", 666666, LocalDate.of(1992, 9, 2), true);
      
       alu.modificarAlumno(alumno);
       
        */
       
       //-------------------------------------------------------------

       // CAMBIAR ESTADO ALUMNO
       
       /*
       
       Alumno alumno = new Alumno(1, "Cristian", "Ridao", 112233, LocalDate.of(1992, 9, 2), false);
       
       alu.cambiarEstadoAlumno(alumno);
       
       */
       
       //-------------------------------------------------------------
       
       // BUSCAR ALUMNO POR ID
       
        /*
        
        int id = 1;
        
        if(alu.buscarAlumno(id)!=null) {
            System.out.println(alu.buscarAlumno(id));
        }
        
        */
       
       //-------------------------------------------------------------
       
        // BUSCAR ALUMNO POR DNI
        
        /*
        
        int dni = 112233;
        
        if(alu.buscarAlumnoPorDni(dni)!=null) {
            System.out.println(alu.buscarAlumnoPorDni(dni));
        }
        
        */
        
        
    }
    
}
