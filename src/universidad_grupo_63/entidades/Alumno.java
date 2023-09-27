/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad_grupo_63.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author valentinobulgarelli
 */
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private boolean estadoAlumno;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    

    //Constructor Vacio
    public Alumno() {
    }
    
    //Constructor Con ID
    public Alumno(int idAlumno, String nombre, String apellido, int dni, LocalDate fechaNacimiento, boolean estadoAlumno) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoAlumno = estadoAlumno;
    }

    //Constructor Sin ID
    public Alumno(String nombre, String apellido, int dni, LocalDate fechaNacimiento, boolean estadoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoAlumno = estadoAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstadoAlumno() {
        return estadoAlumno;
    }

    public void setEstadoAlumno(boolean estadoAlumno) {
        this.estadoAlumno = estadoAlumno;
    }
    

    // SOBREESCRITURA METODO TOSTRING
    
    
    @Override
    public String toString() {
        return "Alumno: " + "\nid Alumno: " + idAlumno + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nFecha Nacimiento: " + fechaNacimiento + "\nEstado Alumno: " + estadoAlumno +"\n------------------------";
    }
    
  
}
