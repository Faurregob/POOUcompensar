package Evaluacion5;

public class Efectivo extends MetodoPago{

    public Efectivo(String nombre) {
        super(nombre);
    }

    
    
    
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de " + monto + " realizado en efectivo.");
    
    }
    
    public double calcularCambio(double monto, double montoPagado){
        return (montoPagado-monto);
    }
    
    
}
