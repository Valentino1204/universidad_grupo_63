/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad_grupo_63.entidades;

/**
 *
 * @author valentinobulgarelli
 */
public class Materia {
    
    private int idMateria;
    private String nombreMateria;
    private int anio;
    private boolean estadoMateria;

    public Materia() {
    }

    public Materia(int idMateria, String nombreMateria, int anio, boolean estadoMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.estadoMateria = estadoMateria;
    }

    public Materia(String nombreMateria, int anio, boolean estadoMateria) {
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.estadoMateria = estadoMateria;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstadoMateria() {
        return estadoMateria;
    }

    public void setEstadoMateria(boolean estadoMateria) {
        this.estadoMateria = estadoMateria;
    }

    @Override
    public String toString() {
        return "Materia: " + "\nidMateria: " + idMateria + "\nnombreMateria: " + nombreMateria + "\nAño: " + anio + "\nEstado Materia: " + estadoMateria + "\n------------------";
    }
    
}
