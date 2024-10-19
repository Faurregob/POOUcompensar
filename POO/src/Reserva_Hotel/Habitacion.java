package Reserva_Hotel;

public class Habitacion extends TipoReserva  implements Cancelacion{

    private int numeroHabitacion;
    private String tipoHabitacion;

    public Habitacion(String nombreCliente, int numeroHabitacion, String tipoHabitacion) {
        super(nombreCliente);
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public void realizarReserva(int numeroNoches) {
        System.out.println("La reserva se realizo por " + numeroNoches + " noches");
    }

    public void calcularCostoTotal(double costoPorNoche, int numeroNoches) {

        System.out.println("Valor por noche reservada: $" + costoPorNoche);
        System.out.println("Numero de Noches reservadas: " + numeroNoches);
        System.out.println("Costo Total de la reserva: $" + (costoPorNoche * numeroNoches));

    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero Habitacion: " + numeroHabitacion + "\n"
                         + "Tipo de Habitacion: " + tipoHabitacion);
    }

    @Override
    public void cancelarReserva() {
        super.mostrarDetalles();
        System.out.println("La reserva de la Habitacion "+numeroHabitacion+" se cancela con exito");  
    }

}
