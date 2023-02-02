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
public class mainClass {
    static ArrayList<Clase> allClase=new ArrayList();
    
    public static void menu(){
        System.out.println("1. Listado de clases (toda la informacion menos la lista de alumnos)\n"+
                            "2. Listado de clases (toda la informacion, con la lista de alumnos)\n"+
                            "3. Añadir una clase.\n"+
                            "4. Eliminar una clase\n"+
                            "5. Eliminar todas las clases\n"+
                            "6. Busqueda de una clase por nombre\n"+
                            "7. Listado de los alumnos de una clase con toda su información\n"+
                            "8. Añadir un alumno a un clase\n"+
                            "9. Eliminar un alumno de una clase indicando su primer apellido\n"+
                            "10. Eliminar todos los alumnos de una clase (pedir confirmación antes)\n"+
                            "11. Listar todos los alumnos del colegio con nota media mayor o igual que una dada.\n"+
                            "12. Listar todos los alumnos de una clase con nota media mayor o igual que una dada.\n"+
                            "13. Listar los 5 mejores alumnos por toda media de cada clase\n"+
                            "14. Integrantes del equipo (mostrará los nombres de los alumnos).\n"+
                            "15. Salir de programa");
    }
    
    public static void LCSA(){
        for(int i=0;i<allClase.size();i++){
            System.out.println(allClase.get(i).getNombreClase()+"\n"+
                                allClase.get(i).getPlanta()+"\n"+
                                allClase.get(i).getMetrosCuadrados());
        }
    }
    public static void LCCA(){
        for(int i=0;i<allClase.size();i++){
            System.out.println(allClase.get(i).getNombreClase()+"\n"+
                                allClase.get(i).getPlanta()+"\n"+
                                allClase.get(i).getMetrosCuadrados()+"\n"+
                                allClase.get(i).getAlumnos());
        }
    }
    
    public static void AniadirClase(){
        Scanner sc= new Scanner(System.in);
        //Creacion Equipo
        String nClase=sc.nextLine();
       
        Integer planta=sc.nextInt();
        sc.nextLine();
        Integer metrosCuadrados=sc.nextInt();
        sc.nextLine();
        
        allClase.add(new Clase(nClase,planta,metrosCuadrados,new ArrayList<Alumno>()));
    
    }
    
    public static void ElminarClase(){
        Scanner sc= new Scanner(System.in);
        LCSA();
        System.out.println("Dime el nombre de la clase que quieres elimiar");
        String nombreClase=sc.nextLine();
        
        boolean respuesta=true;
        while(respuesta){
            String confirmacion=sc.nextLine();
            if(confirmacion.toLowerCase().equals("si")){
                for (int i = 0; i < allClase.size(); i++) {
                    allClase.remove(allClase.get(i).getNombreClase().equals(nombreClase));                    
                }
                respuesta=false;
            }else{
                confirmacion=sc.nextLine();
            }
        }        
    }
     
    public static void ElimarTodasClases(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Seguro que quieres eliminar todas las clases: ");
        String confirmacion=sc.nextLine();
        
        boolean respuesta=true;
        while(respuesta){
            if(confirmacion.toLowerCase().equals("si")){                
                allClase.removeAll(allClase);   
                respuesta=false;
            }else{
                confirmacion=sc.nextLine();
            }
        }   
    }
    
    public static void BuquedaClaseNombre(){
        Scanner sc= new Scanner(System.in);
        String nombreClase=sc.nextLine();
        for (int i = 0; i < allClase.size(); i++) {
            if(nombreClase.equals(allClase.get(i).getNombreClase())){
                System.out.println("Su clase se encuentra en la posicion: "+i+" y se llama: "+nombreClase);
            }else{
                System.out.println("Esa clase no se encuentra");
            }            
        }
    }
    
    public static void ListadoAlumnos(){        
        Scanner sc= new Scanner(System.in);
        
        String nombreClase=sc.nextLine();
        for (int i = 0; i < allClase.size(); i++) {
            if(nombreClase.equals(allClase.get(i).getNombreClase())){
                System.out.println(allClase.get(i).getAlumnos());
            }else{
                System.out.println("No se encuentra ninguna clase con ese nombre");
            }            
        }
    }
    
    public static void AniadirAlumno(){
        Scanner sc= new Scanner(System.in);
        System.out.println("A que clase quieres meterlo");
        String nombreClase=sc.nextLine();
        
        for (int i = 0; i <allClase.size(); i++) {
            if(nombreClase.equals(allClase.get(i).getNombreClase())){
                String nombreAlumno=sc.nextLine();
                String primerApellido=sc.nextLine();
                String segundoApellido=sc.nextLine();
                Integer edad=sc.nextInt();
                sc.nextLine();
                Float notaMedia=sc.nextFloat();
                sc.nextLine();        
                allClase.get(i).getAlumnos().get(i).setNombreAlumno(nombreAlumno);
                allClase.get(i).getAlumnos().get(i).setPrimerApellidoAlumno(primerApellido);
                allClase.get(i).getAlumnos().get(i).setSegundoApellidoAlumno(segundoApellido);
                allClase.get(i).getAlumnos().get(i).setEdad(edad);
                allClase.get(i).getAlumnos().get(i).setNotaMedia(notaMedia);            
            }else{
                System.out.println("Esa clase no existe");
            }
        }        
    }
    
    public static void EliminarXApellido(){
        Scanner sc= new Scanner(System.in);
        String apellido=sc.nextLine();
        
        for (int i = 0; i < allClase.size(); i++) {
            allClase.get(i).getAlumnos().remove(allClase.get(i).getAlumnos().get(i).getPrimerApellidoAlumno().equals(apellido));            
        }
    }
    
    public static void EliminarAlumnos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Que alumnos de que clase quieres eliminar");
        String nombreClase=sc.nextLine();
        
        
        for (int i = 0; i < allClase.size(); i++) {
            if(nombreClase.equals(allClase.get(i).getNombreClase())){
                String respuesta=sc.nextLine();
                if(respuesta.toLowerCase().equals("si")){                    
                    allClase.get(i).getAlumnos().removeAll(allClase.get(i).getAlumnos());
                }else{
                    System.out.println("Lo siento no lo puedo borrar");
                }
            }
        }
    }
    
    public static void AlumnosMNotaCo(float nMedia){
        float mayor=0f;
        for (int i = 0; i < allClase.size(); i++) {
            if(i==0){
                mayor=allClase.get(i).getAlumnos().get(i).getNotaMedia();                
            }else{
                if(allClase.get(i).getAlumnos().get(i).getNotaMedia()>=mayor){
                    System.out.println("El alumno: "+allClase.get(i).getAlumnos()+" con una nota mayor o igual a la dada con una nota de: " + allClase.get(i).getAlumnos().get(i).getNotaMedia());
                    mayor=allClase.get(i).getAlumnos().get(i).getNotaMedia();    
                }
            }            
        }
    }
    
    public static void AlumnosMNotaCa(String nombreClase,float nMedia){
        float mayor=0f;
        
        for (int i = 0; i < allClase.size(); i++) {
            if(i==0){
                if(nombreClase.equals(allClase.get(i).getNombreClase())){                    
                    mayor=allClase.get(i).getAlumnos().get(i).getNotaMedia();     
                }           
            }else{
                if(nombreClase.equals(allClase.get(i).getNombreClase())){                    
                    if(allClase.get(i).getAlumnos().get(i).getNotaMedia()>=mayor){
                        System.out.println("El alumno: "+allClase.get(i).getAlumnos()+"de la clase: "+allClase.get(i).getNombreClase()+" con una nota mayor o igual a la dada con una nota de: " + allClase.get(i).getAlumnos().get(i).getNotaMedia());
                        mayor=allClase.get(i).getAlumnos().get(i).getNotaMedia();    
                    }   
                }
            }            
        }
    }
    
    
    
    public static void main(String[] args) {
        
    }
    
}
