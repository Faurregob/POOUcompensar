package evaluacion;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", "Electronica");
        Producto producto2 = new Producto("Camara", "Fotografia", 2000, 25);

        producto1.obtenerDetalle(true, true);
        producto2.obtenerDetalle(true, true);

        System.out.println("\nEl costo total del Producto es: " + producto2.calcularCostoTotal());

    }
}
