package Ejercicio_Interfaces;

public class Bicicleta extends MedioTransporte /*implements Transporte*/{

    public Bicicleta(String nombre) {
        super(nombre);
    }

    
    @Override
    public void iniciarViaje(double distancia) {
        
    }
    
    public double calcularDuracionViaje(double distancia, double velocidadPromedio){
        return distancia / velocidadPromedio;
    }
    
    
    
}
