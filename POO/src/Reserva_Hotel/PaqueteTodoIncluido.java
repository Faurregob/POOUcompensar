package Reserva_Hotel;

public class PaqueteTodoIncluido extends TipoReserva implements Cancelacion{

    public PaqueteTodoIncluido(String nombreCliente) {
        super(nombreCliente);
    }
    
    
    @Override
    public void realizarReserva(int numeroNoches) {
        
    }
    
    public void agregarServiciosAdicionales(String servicio){
        System.out.println("Servicio adicional agregado: "+servicio);
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva de paquete todo incluido cancelada");
    }
    
    
    
    
}
