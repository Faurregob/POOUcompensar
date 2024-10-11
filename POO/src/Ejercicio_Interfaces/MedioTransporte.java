package Ejercicio_Interfaces;

public abstract class MedioTransporte implements Transporte{
    
    private String nombre;

    public MedioTransporte(String nombre) {
        this.nombre = nombre;
    }
    
        
    public void mostrarDetalle(){
        System.out.println("Usted a seleccionado el medio de Transporte: "+nombre);
    }

    @Override
    public void iniciarViaje(double distancia) {
        
    }
    
}
