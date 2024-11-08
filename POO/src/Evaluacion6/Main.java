package Evaluacion6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Vendedor vendedor1 = new Vendedor();
        String rutaArchivo =("C:\\Users\\Freddy Urrego\\Downloads\\Vendedor.txt");
        
        try{
            vendedor1.leerDatos(rutaArchivo);
            vendedor1.mostrarInformacion();
            
        }catch(FileNotFoundException ef){
            System.out.println("Error: El archivo no se encontró.");
        }catch(IOException ec){
            System.out.println("Error: Problema al leer el archivo.");
        }catch (NumberFormatException ex) {
            System.out.println("Error: El formato de las ventas es Incorrecto");
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }
}
