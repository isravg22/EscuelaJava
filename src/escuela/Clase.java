/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isval
 */
public class Clase {
    private String nombreClase;
    private Integer planta;
    private Integer metrosCuadrados;
    private ArrayList<Alumno> alumnos;

    public Clase() {
       
    }

    public Clase(String nombreClase, Integer planta, Integer metrosCuadrados, ArrayList<Alumno> alumnos) {
        this.nombreClase = nombreClase;
        this.planta = planta;
        this.metrosCuadrados = metrosCuadrados;
        this.alumnos = alumnos;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public Integer getPlanta() {
        return planta;
    }

    public void setPlanta(Integer planta) {
        this.planta = planta;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombreClase=" + nombreClase + ", planta=" + planta + ", metrosCuadrados=" + metrosCuadrados + ", alumnos=" + alumnos + '}';
    }
    
    public void valorClase(){
       Scanner sc=new Scanner(System.in);
        while(!getNombreClase().toLowerCase().equals("dam") ||!getNombreClase().toLowerCase().equals("mkt")||!getNombreClase().toLowerCase().equals("edi")||!getNombreClase().toLowerCase().equals("afi")){
            setNombreClase(sc.nextLine());
        }
    }
    public void valorPlanta(){
       Scanner sc=new Scanner(System.in);
        while(getPlanta()!=1||getPlanta()!=2){
            setPlanta(sc.nextInt());
        }
    }
}
