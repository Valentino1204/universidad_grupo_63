
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
       
       //-------------------------------------------------------------
       
       // AGREGAR ALUMNO
       
       /*
       
       Alumno alumno = new Alumno("Cristian", "Ridao", 112233, LocalDate.of(1992, 9, 2), true);
         
       
       AlumnoData alu = new AlumnoData();
       alu.guardarAlumno(alumno);
       
       */
       
       // MODIFICAR ALUMNO
       
       /*
       
      Alumno alumno = new Alumno(1, "Carlos", "Ridao", 666666, LocalDate.of(1992, 9, 2), true);
       
       AlumnoData alu = new AlumnoData();
       alu.modificarAlumno(alumno);
       
      */

       /*
       
       // CAMBIAR ESTADO ALUMNO
       
       Alumno alumno = new Alumno(1, "Carlos", "Ridao", 666666, LocalDate.of(1992, 9, 2), false);
       
       AlumnoData alu = new AlumnoData();
       
       alu.cambiarEstadoAlumno(alumno);
       
       */
       
       // BUSCAR ALUMNO POR ID
       
       /*
        AlumnoData alu = new AlumnoData();
        
        int id = 8;
        
        if(alu.buscarAlumno(id)!=null) {
            System.out.println(alu.buscarAlumno(id));
       // } else {
       //    System.out.println("No existe el alumno con ese id");
        }
        */
       
       
        // BUSCAR ALUMNO POR DNI
        
        AlumnoData alu = new AlumnoData();
        
         int dni = 5;
        
        if(alu.buscarAlumnoPorDni(dni)!=null) {
            System.out.println(alu.buscarAlumnoPorDni(dni));
        }
        
       
        
        
    }
    
}
