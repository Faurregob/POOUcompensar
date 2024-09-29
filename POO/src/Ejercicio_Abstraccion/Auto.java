package Ejercicio_Abstraccion;

public class Auto extends Vehiculo{
      
    private static final double COSTO_POR_LITRO_COMBUSTIBLE = 1.20;

    public Auto(double kilometrosRecorridos, double litrosCombustible) {
        super(kilometrosRecorridos, litrosCombustible);
    }

    @Override
    public double calcularConsumo() {
        return (litrosCombustible/kilometrosRecorridos);
    }

    @Override
    public double calcularCostoMantenimiento() {
        return (100+(0.02*kilometrosRecorridos));
    }

    @Override
    public double calcularCostoTotal() {
        double consumoauto = calcularConsumo()*COSTO_POR_LITRO_COMBUSTIBLE;
        double costoTotalauto = (consumoauto+calcularCostoMantenimiento());
        return(costoTotalauto);
    }
    
    
}
