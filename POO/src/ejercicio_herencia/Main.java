package ejercicio_herencia;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numeroFactura  = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de su factura"));  
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor total de la factura"));
        float ivaValor = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor del  IVA"));
            

        Factura factura = new Factura(numeroFactura, valorTotal);
        FacturaIVA facturaconIva = new FacturaIVA(ivaValor, numeroFactura, valorTotal);
        
        JOptionPane.showMessageDialog(null,"Detalle de la Factura Sin Iva: ");
        factura.mostrarDetallesFactura();
        
        JOptionPane.showMessageDialog(null,"Detalle de la Factura Con Iva: ");
        facturaconIva.mostrarDetallesFactura();
       
    }
    
}
