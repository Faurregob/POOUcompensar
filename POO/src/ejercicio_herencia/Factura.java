package ejercicio_herencia;

import javax.swing.JOptionPane;

public class Factura {

    private int numeroFactura;
    private double valorFactura;

    public Factura(int numeroFactura, double valorFactura) {
        this.numeroFactura = numeroFactura;
        this.valorFactura = valorFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void mostrarDetallesFactura() {
        JOptionPane.showMessageDialog(null,"El numero de la factura es: " + this.numeroFactura + "\n"
                + "El Valor total de la Factura es: " + this.valorFactura);
    }

}
