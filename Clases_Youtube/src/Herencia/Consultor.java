package Herencia;

public class Consultor extends Persona{
    String num_consultora;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String num_consultora, int num_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_consultora = num_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(String num_consultora) {
        this.num_consultora = num_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
}
