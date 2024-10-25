package Herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado emple =  new Empleado();
        
        emple.getNum_legajo();
        emple.getNombre();
        
        Consultor consult = new Consultor();
        consult.getNum_consultor();
        consult.getNombre();
        
        Persona vector [] = new Persona [5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        perso = consul;
        
        
        
    }
}
