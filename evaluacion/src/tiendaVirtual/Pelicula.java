package tiendaVirtual;

public class Pelicula extends Producto{
    public static int cantidadpeliculasVendidas=0;
    private String director;

    public Pelicula(String director, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.director = director;
        cantidadpeliculasVendidas++;
    }

    public static int getcantidadpeliculasVendidas() {
        return cantidadpeliculasVendidas;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("El nombre del director es: "+director);
        //System.out.println("La cantidad de peliculas vendidas es: "+cantidadpeliculasVendidas);
    }
    
}
