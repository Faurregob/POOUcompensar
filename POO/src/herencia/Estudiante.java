package herencia;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    /*String nombre = getNombre();
    String apellido = getApellido();
    int edad = getEdad();*/
    
    public void mostrarDatos() {
        System.out.println("El nombre y apellido es: " + getNombre() + " " + getApellido() + "\n"
                + "La edad es: " + getEdad() + "\n"
                + "Codigo: " + this.codigoEstudiante + "\n"
                + "Nota Final: " + this.notaFinal);

    }
}