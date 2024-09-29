package Ejercicio_Abstraccion;

public abstract class Vehiculo {
    protected double kilometrosRecorridos;
    protected double litrosCombustible;
    //protected double recorrido;

    public Vehiculo(double kilometrosRecorridos, double litrosCombustible) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.litrosCombustible = litrosCombustible;
    }
    
      
    public abstract double calcularConsumo();
    public abstract double calcularCostoMantenimiento();
    public abstract double calcularCostoTotal();
    
    public boolean necesitaRevision(){
        //return kilometrosRecorridos>10000;
        if (kilometrosRecorridos>10000) {
            return true;
        }else
            return false;
        
    }
    
}
