package Ejercicio_Interfaces;

public class Autobus extends MedioTransporte implements Transporte{
    private int capacidadPasajeros;
    private int numeroRutas;

    public Autobus(String nombre, int capacidadPasajeros, int numeroRutas) {
        super(nombre);
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroRutas = numeroRutas;
    }
    
    
    @Override
    public void iniciarViaje(double distancia) {
        
    }
    
    public double calcularCostoViaje(double distancia,double tarifaPorKilometro ){
        return distancia*tarifaPorKilometro;
    }
    
    
    
}
