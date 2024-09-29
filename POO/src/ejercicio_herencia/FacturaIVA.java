package ejercicio_herencia;

import javax.swing.JOptionPane;

public class FacturaIVA extends Factura {
    private float valorIva;

    public FacturaIVA(float valorIva, int numeroFactura, double valorFactura) {
        super(numeroFactura, valorFactura);
        this.valorIva = valorIva;
    }
    
    public double calcularIva(){
        return (getValorFactura()*valorIva)/100;
    }
    
    @Override
    public void mostrarDetallesFactura(){
        double totalIva = calcularIva();
        double totalFactura = (getValorFactura()+calcularIva());
        super.mostrarDetallesFactura();
        JOptionPane.showMessageDialog(null,"IVA: "+valorIva+"%"+"\n"
                                         + "El valor del Iva calculado es: "+totalIva+"\n"
                                         + "El valor total de la factura con el Iva es: "+totalFactura);
    }
    
}
