package tiendaVirtual;
public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private static int cantidadProductosVendidos=0;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        cantidadProductosVendidos++;
    }

    public static int getCantidadProductosVendidos() {
        return cantidadProductosVendidos;
    }

       
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+"\n"
                + "Descripcion: "+this.descripcion+"\n"
                        + "Precio: "+this.precio);
        
        
        //System.out.println("La cantidad de Productos vendidos es: "+cantidadProductosVendidos+"\n");
    }
}