
package universidad_grupo_63_main;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import universidad_grupo_63.accesoADatos.AlumnoData;
import universidad_grupo_63.accesoADatos.Conexion;
import universidad_grupo_63.accesoADatos.InscripcionData;
import universidad_grupo_63.accesoADatos.MateriaData;
import universidad_grupo_63.entidades.Alumno;
import universidad_grupo_63.entidades.Inscripcion;
import universidad_grupo_63.entidades.Materia;


public class UniversidadGrupo63 {

    
    public static void main(String[] args) {
        
       // PARA SABER SI FUNCIONA LA CONEXIÓN
       //Connection con = Conexion.getConexion();
       // PONÉS EN EL TECLADO SHIFT + F6 Y NO TENDRÍA QUE DAR ERROR
       
       AlumnoData alu = new AlumnoData();
       
       MateriaData mat = new MateriaData();
       
       InscripcionData insc = new InscripcionData();
       
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
        
        //-------------------------------------------------------------
        
        // LISTAR ALUMNOS
        
        /*
                
        for (Alumno alumno: alu.listarAlumnos() ) { // TIPO DE DATO + NOMBRE VARIABLE + MÉTODO alu.listarAlumnos() 
            System.out.println(alumno); // alumno DEL RENGLÓN ANTERIOR ES DECIR DEL for (Alumno alumno
        }
        
        */

        //-------------------------------------------------------------
        
        // AGREGAR MATERIA
        /*
        Materia materia = new Materia("Física", 1, true);
        
        mat.guardarMateria(materia);
        */
        //-------------------------------------------------------------
        
       // MÉTODO MODIFICAR MATERIA
       
       /*
       
       Materia materia = new Materia (1, "Química", 1, true);
       
       mat.modificarMateria(materia);
        
       */
       
       //-------------------------------------------------------------
       
       // MÉTODO CAMBIAR ESTADO MATERIA
       
       /*
       
       Materia materia = new Materia (1, "Química", 1, false);
        
       mat.cambiarEstadoMateria(materia);
        
       */
       
       //-------------------------------------------------------------
       
       // MÉTODO BUSCAR MATERIA
       /*
       int id = 1;
        
        if(mat.buscarMateria(id)!=null) {
            System.out.println(mat.buscarMateria(id));
        }
        */
        //-------------------------------------------------------------
       
        
        // MÉTODO BUSCAR MATERIA POR NOMBRE
        /*
        String nombremat = "Matemática";
        
        if(mat.buscarMateriaNombre(nombremat)!=null) {
            System.out.println(mat.buscarMateriaNombre(nombremat));
        }
        */
        //-------------------------------------------------------------
        
        // MÉTODO BUSCAR MATERIA POR AÑO
        /*
        int aniomat = 1;
        
         if(mat.buscarMateriaAnio(aniomat)!=null) {
            System.out.println(mat.buscarMateriaAnio(aniomat));
        }
        */
        //-------------------------------------------------------------
        
        // MÉTODO LISTAR MATERIAS
        /*
        for(Materia materia : mat.listarMaterias()){
            System.out.println(materia);
        }
        */
        //-------------------------------------------------------------
        
        // MÉTODO GUARDAR INSCRIPCIÓN
        
        /*
        Alumno alumno = new Alumno(1, "Cristian", "Ridao", 112233, LocalDate.of(1992, 9, 2), true);
        Materia materia = new Materia (1, "Química", 1, true);
        Inscripcion inscrip = new Inscripcion (alumno, materia);
        
        insc.guardarInscripcion(inscrip);
        */
        
        /*
        Alumno alumno = alu.buscarAlumno(4); // alu INSTANCIA DE AlumnoData
        
        Materia materia = mat.buscarMateria(5); // mat INSTANCIA DE MateriaData
        
        if(alumno != null && materia != null){
            Inscripcion inscripcion = new Inscripcion (alumno, materia); 
        
            insc.guardarInscripcion(inscripcion); // guardarInscripcion PERTENECE A LA CLASE InscripcionData
        }
        */
              

        //-------------------------------------------------------------
        
        // MÉTODO ACTUALIZAR NOTA
        
        /*
        Alumno alumno = alu.buscarAlumno(1); // alu INSTANCIA DE AlumnoData
        
        Materia materia = mat.buscarMateria(1); // mat INSTANCIA DE MateriaData
        
        Inscripcion inscripcion =  new Inscripcion (9, alumno, materia);
        
        insc.actualizarNota(inscripcion, (float) 8);
        */
        
        /*
        for (Inscripcion inscripcion : insc.obtenerInscripciones()) {
            if (inscripcion.getIdInscripcion()==3) { // MODIFICA ÚNICAMENTE POR EL ID INSCRIPCIÓN
                insc.actualizarNota(inscripcion.getIdInscripcion(), 2); // VALOR DE LA NOTA MODIFICADA
            }
        }
        */
        
        
        //-------------------------------------------------------------
        
        // MÉTODO OBTENER INSCRIPCIONES
        
        /*
        for(Inscripcion inscripcion : insc.obtenerInscripciones()){
            System.out.println(inscripcion);
        }
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO BORRAR INSCRIPCIÓN MATERIA ALUMNO
        
        /*
        insc.borrarInscripcionMateriaAlumno(1);
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO OBTENER INSCRIPCIONES POR ALUMNO
        
        /*
        for(Inscripcion inscripcion : insc.obtenerInscripcionesPorAlumno(3)){
            System.out.println(inscripcion);
        }
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO OBTENER MATERIAS CURSADAS
        
        /*
        for(Materia materia : insc.obtenerMateriasCursadas(1)){
            System.out.println(materia);
        }
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO OBTENER MATERIAS NO CURSADAS
        
        /*
        for(Materia materia : insc.obtenerMateriasNoCursadas(1)){
            System.out.println(materia);
        }
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO OBTENER ALUMNOS POR MATERIA
        
        /*
        for(Alumno alumno : insc.obtenerAlumnosPorMateria(1)){
            System.out.println(alumno);
        }
        */
    }
    
}
