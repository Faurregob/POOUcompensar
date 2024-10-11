package Interfaces1;

public class Bicicleta implements Silla, Rueda{
    
    @Override
    public void sentar(){
        System.out.println("Sentarse en un sillin");
    }
    
    @Override
    public void avanzar(){
        System.out.println("La bicicleta avanza");
    }
    
    @Override
    public void frenar(){
        System.out.println("La bicicleta frena");
    }
    
}
