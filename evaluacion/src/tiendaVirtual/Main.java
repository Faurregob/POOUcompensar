package tiendaVirtual;

public class Main {
    public static void main(String[] args) {
        Libro libros1 = new Libro("Gabriel Garcia Marquez", "100 años de Soledad", "Libros de Poesia", 20000);
        Pelicula peliculas1 = new Pelicula("Robert Downey Jr", "Iron Man", "Tony Stark, un multimillonario magnate empresarial", 100000);
        
        libros1.mostrarInformacion();
        peliculas1.mostrarInformacion();
        
        System.out.println("\nLa cantidad de productos es: "+Producto.getCantidadProductosVendidos()+"\n");
        System.out.println("La cantidad de Libros vendidos es:"+Libro.getCantidadLibrosVendidos()+"\n");
        System.out.println("La cantidad de peliculas vendidas es: "+Pelicula.getcantidadpeliculasVendidas()+"\n");
    }
    
}
