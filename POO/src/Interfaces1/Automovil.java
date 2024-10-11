package Interfaces1;

public class Automovil implements Rueda,Silla{

    //Palabra reservada para implementar la interface "implements"
    
    @Override
    public void avanzar() {
        System.out.println("El automovil avanza a una velocidad de: "+VELOCIDAD+" km/h");
    }

    @Override
    public void frenar() {
        System.out.println("El automovil frena");
    }
    
    @Override
    public void sentar(){
        System.out.println("Sentarse en una silla comoda");
    }
    

    
    
    
}
