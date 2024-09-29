package colegio;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notafinal;

    public Estudiante(String nombre, String apellidos, int edad,int codigoEstudiante, float notafinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notafinal = notafinal;
    }

    public void mostrarDatos(){
        
    }

}
