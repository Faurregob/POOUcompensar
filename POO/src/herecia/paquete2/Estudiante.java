package herecia.paquete2;

import herencia.Persona;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    
    
    

    /*public static void main(String[] args) {
        Persona estudiante2 = new Persona("freddy", "Urrego", 34);
            estudiante2.nombre  = "carlos";
        
    }*/
    
    public static void main(String[] args) {
        Estudiante estudiante2 = new Estudiante("freddy", "Urrego", 34);
        
            System.out.println("El nombre inicial es: "+estudiante2.nombre);
            estudiante2.nombre  = "carlos";
            System.out.println("El nombre actual es: "+estudiante2.nombre);
        
    }

}
