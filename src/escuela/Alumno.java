/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author isval
 */
public class Alumno {
    private String nombreAlumno;
    private String primerApellidoAlumno;
    private String segundoApellidoAlumno;
    private Integer edad;
    private float notaMedia;

    public Alumno() {
    }

    
    
    public Alumno(String nombreAlumno, String primerApellidoAlumno, String segundoApellidoAlumno, Integer edad, Float notaMedia) {
        this.nombreAlumno = nombreAlumno;
        this.primerApellidoAlumno = primerApellidoAlumno;
        this.segundoApellidoAlumno = segundoApellidoAlumno;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getPrimerApellidoAlumno() {
        return primerApellidoAlumno;
    }

    public void setPrimerApellidoAlumno(String primerApellidoAlumno) {
        this.primerApellidoAlumno = primerApellidoAlumno;
    }

    public String getSegundoApellidoAlumno() {
        return segundoApellidoAlumno;
    }

    public void setSegundoApellidoAlumno(String segundoApellidoAlumno) {
        this.segundoApellidoAlumno = segundoApellidoAlumno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    
    
}
