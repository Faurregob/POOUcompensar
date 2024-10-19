package Reserva_Hotel;

public class SistemaReserva {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion("Freddy Urrego", 105, "Doble");
        PaqueteTodoIncluido pq1 = new PaqueteTodoIncluido("Freddy Urrego");
        
        habitacion1.realizarReserva(4);
        habitacion1.mostrarDetalles();
        double costoTotal = habitacion1.calcularCostoTotal(100000,4);
        System.out.println("El valor total de la reserva es: "+costoTotal);
        
        System.out.println();
        
        pq1.realizarReserva(3);
        pq1.mostrarDetalles();
        pq1.agregarServiciosAdicionales("Spa");
        
        System.out.println();
        habitacion1.cancelarReserva();
        pq1.cancelarReserva();
        
    }
}
