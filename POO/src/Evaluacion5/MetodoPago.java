package Evaluacion5;

public abstract class MetodoPago {
    private String nombre;

    public MetodoPago(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void realizarPago(double monto);
    
    public void mostrarDetalles(){
        System.out.println("Metodo de Pago: "+nombre);
    }
    
}

