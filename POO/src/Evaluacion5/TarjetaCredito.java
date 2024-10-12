package Evaluacion5;

public class TarjetaCredito extends MetodoPago{
    private String numeroTarjeta;
    private String fechaExpiracion;

    public TarjetaCredito(String nombre, String numeroTarjeta, String fechaExpiracion) {
        super(nombre);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Tarjeta de Credito numero:  "+numeroTarjeta);
        System.out.println("Fecha de expiracion: "+fechaExpiracion);
        System.out.println("El valor a pagar con tarjeta de Credito es: $"+ monto);   
    }
    
    public double calcularInteres(double monto, double tasaInteres){
        double interes = (monto*tasaInteres)/100;
        double total = (interes+monto);
        return (monto * tasaInteres)/100;
    }
    
    
}
