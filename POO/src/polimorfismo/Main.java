package polimorfismo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangulo recta1 = new Rectangulo(8, 3);
        Circulo circulo = new Circulo(2);
        Pentagono penta = new Pentagono(12);

        penta.setLado(15);

        System.out.println("El area del Rectangulo es: " + recta1.calcularArea() + "\n"
                + "El radio del Circulo es: " + circulo.calcularArea() + "\n"
                + "El area del Pentagono es: " + penta.calcularArea());
    }

}
