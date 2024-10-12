package Evaluacion5;

//import java.util.Scanner;

public class SistemaPago {
    public static void main(String[] args) {
        TarjetaCredito tj = new TarjetaCredito("Tarjeta de Credito", "983429892234", "2032/10/24");
        Efectivo efectivo = new Efectivo("Efectivo");
        
                
        
        tj.mostrarDetalles();
        tj.realizarPago(200000);
        double interes = tj.calcularInteres(200000, 50);
        System.out.println("Interes Calculado: "+interes);
        System.out.println("\n");
        
        
        efectivo.mostrarDetalles();
        efectivo.realizarPago(50000);
        double cambio = efectivo.calcularCambio(50000, 100000);
        System.out.println("Su cambio es: "+cambio);
    }
}
