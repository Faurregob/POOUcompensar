package clases.objetos.atributos.metodos;
public class Principal {
    public static void main(String[] args) {
        Carro v1compacto = new Carro();
        v1compacto.cantidadPuertas = 3;
        v1compacto.cantidadSillas = 3;
        v1compacto.color = "Rojo";
        v1compacto.marca = "Chevrolet";
        v1compacto.modelo = 2019;
        v1compacto.placa = "ELT-517";
        
        v1compacto.mostrarDatos();
        v1compacto.acelerar(85f);
        v1compacto.frenar();
        
        Carro camionetaHB = new Carro();
        camionetaHB.cantidadPuertas = 5;
        camionetaHB.cantidadSillas = 7;
        camionetaHB.color = "Gris";
        camionetaHB.marca = "Toyota";
        camionetaHB.modelo = 2024;
        camionetaHB.placa = "DFE-456";
        
        camionetaHB.mostrarDatos();
        camionetaHB.acelerar(120f);
        camionetaHB.frenar();

        
        
    }
}
