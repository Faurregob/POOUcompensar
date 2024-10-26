package Ejercicio_excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        String rutaArchivo = ("C:\\Users\\Freddy Urrego\\OneDrive\\Escritorio\\Programacion\\Ucompensar\\POOUcompensar\\Prueba\\Prueba2.txt");
        
        try{
            estudiante1.leerDatos(rutaArchivo);
            estudiante1.mostrarInformacion();
        } catch (FileNotFoundException ef) {
            System.out.println("Error: El archivo no se encontró.");
        } catch (IOException ec) {
            System.out.println("Error: Problema al leer el archivo.");
        } catch (NumberFormatException ex) {
            System.out.println("Error: Formato incorrecto en la calificación.");
        } finally {
            System.out.println("Operacion finalizada.");
        }

        
    }
}
