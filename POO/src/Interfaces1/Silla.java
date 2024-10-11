package Interfaces1;

public interface Silla {
    
    //public abstract void sentar();
    default void sentar(){
        System.out.println("Sentarse en una silla");
    }
    
}
