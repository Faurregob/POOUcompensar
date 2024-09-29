package evaluacion;

public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int stock; //Cantidad disponible en la tienda

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public void obtenerDetalle() {
        System.out.println("Nombre del Producto: " + this.nombre + "\n"
                + "Categoria del Producto: " + this.categoria + "\n");
    }

    public void obtenerDetalle(boolean incluirPrecio, boolean incluirStock) {
        if (incluirStock == true & incluirPrecio == true) {
            System.out.println("Nombre del Producto: " + this.nombre + "\n"
                    + "Categoria del Producto: " + this.categoria + "\n"
                    + "Valor del Producto: " + this.precio + "\n"
                    + "Cantidad de Unidades del Producto disponibles en la tienda: " + this.stock + "\n");
        
        } else if (incluirPrecio == true & incluirStock == false) {
            System.out.println("Nombre del Producto: " + this.nombre + "\n"
                    + "Categoria del Producto: " + this.categoria + "\n"
                    + "Valor del Producto: " + this.precio + "\n");

        } else if (incluirPrecio == false & incluirStock == true) {
            System.out.println("Nombre del Producto: " + this.nombre + "\n"
                    + "Categoria del Producto: " + this.categoria + "\n"
                    + "Cantidad de Unidades del Producto disponibles en la tienda: " + this.stock + "\n");
        } else {

            System.out.println("Nombre del Producto: " + this.nombre + "\n"
                    + "Categoria del Producto: " + this.categoria);
        }
    }

    public double calcularCostoTotal() {
        return (this.precio * this.stock);
    }
}
