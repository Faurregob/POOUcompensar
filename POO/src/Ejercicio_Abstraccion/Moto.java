package Ejercicio_Abstraccion;

public class Moto extends Vehiculo{

    private static final double COSTO_POR_LITRO_COMBUSTIBLE = 1.20;

    public Moto(double kilometrosRecorridos, double litrosCombustible) {
        super(kilometrosRecorridos, litrosCombustible);
    }
    
    @Override
    public double calcularConsumo() {
        return (2*litrosCombustible)/kilometrosRecorridos;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return (0.05*kilometrosRecorridos);
    }

    @Override
    public double calcularCostoTotal() {
        double consumomoto = calcularConsumo()*COSTO_POR_LITRO_COMBUSTIBLE;
        double costoTotalmoto = (consumomoto+calcularCostoMantenimiento());
        return(costoTotalmoto);
    }
    
    
}
