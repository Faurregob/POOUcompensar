package logica;
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Get: Mostrar o Traer "Obtener los datos asignados en las variables"
    //Set: Asignar o Cambiar "Se modifican los valores asignados en las variables"
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre: ");
    }
    
    public void saberAprobado (double calificacion){
        if (calificacion >= 5) {
            System.out.println("Aprobé la materia");
        }else{
            System.out.println("Uyy, no aprobé");
        }
    }
}
