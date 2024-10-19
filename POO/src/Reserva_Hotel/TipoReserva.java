package Reserva_Hotel;

public abstract class TipoReserva implements Reserva{
    private String nombreCliente;

    public TipoReserva(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
        
    public void mostrarDetalles(){
        System.out.println("Nombre Cliente: "+nombreCliente);
    }
    
}
