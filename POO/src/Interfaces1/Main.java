package Interfaces1;

public class Main {
    public static void main(String[] args) {
        Automovil car = new Automovil();
        car.avanzar();
        car.frenar();
        car.sentar();
        
        Bicicleta bici = new Bicicleta();
        bici.avanzar();
        bici.frenar();
        bici.sentar();
    }
    
}
