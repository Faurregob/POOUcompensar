package tiendaVirtual;
public class Libro extends Producto{
    public static int cantidadLibrosVendidos =0;
    private String autor;

    public Libro(String autor, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.autor = autor;
        cantidadLibrosVendidos++;
    }

    public static int getCantidadLibrosVendidos() {
        return cantidadLibrosVendidos;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("El nombre del autor es: "+this.autor+"\n");
        //System.out.println("La cantidad de libros vendidos es: "+cantidadLibrosVendidos+"\n");
    }
}
