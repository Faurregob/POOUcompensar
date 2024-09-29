package clases.objetos.atributos.metodos;

public class Carro {

    String marca;
    int modelo;
    String color;
    int cantidadSillas;
    int cantidadPuertas;
    String placa;

    public void mostrarDatos() {
        System.out.println("Informacion del Vehiculo: \n"
                + "Marca: " + this.marca + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Color: " + this.color + "\n"
                + "Cantidad Sillas: " + this.cantidadSillas + "\n"
                + "Cantidad Puertas: " + this.cantidadPuertas + "\n");
    }
    
    public void acelerar(float velocidad){
        System.out.println("El vehiculo de placa: "+this.placa+" esta avanzando a "+velocidad+ " km/h");
    }
    
    public void frenar (){
        System.out.println("El vehiculo de placa: "+this.placa+" esta deteniendose \n");
    }
}
