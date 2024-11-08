package Evaluacion6;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Vendedor {

    private String nombre;
    private String apellido;
    private double ventasTotales;

    public Vendedor() {
    }
    
    

    public void leerDatos(String rutaArchivo) throws FileNotFoundException, IOException {

        File archivo = new File(rutaArchivo);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        br.close();
        
        this.nombre = br.readLine();
        this.apellido = br.readLine();
        this.ventasTotales = Double.parseDouble(br.readLine());

        //br.close();

    }

    public String verificarMetaCumplpida() {
        double meta = 100000000.0;
        if (ventasTotales >= meta*1.2) {
            return ("Meta Superada con Exito");
        } else if (ventasTotales >= meta && ventasTotales < meta*1.2) {
            return ("Meta Alcanzada");
        } else{
            return ("Meta no Alcanzada");
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ventas Totales: $" + (ventasTotales));
        System.out.println("Resultado de la meta: "+ verificarMetaCumplpida());
        
    }

}
