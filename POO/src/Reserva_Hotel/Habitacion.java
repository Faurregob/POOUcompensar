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
        System.out.println("La reserva se realiza por " + numeroNoches + " noches"+"\n");
    }

    public double calcularCostoTotal(double costoPorNoche, int numeroNoches) {
        System.out.println("Costo por Noche: "+ costoPorNoche);
        System.out.println("Numero de Noches: "+numeroNoches);
        return (costoPorNoche * numeroNoches);

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
