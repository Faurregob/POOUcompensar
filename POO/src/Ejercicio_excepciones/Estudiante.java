package Ejercicio_excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estudiante {
    private String nombre;
    private String apellido;
    private double notaFinal;

    public Estudiante() {
    }
    
    
    
    public void leerDatos(String rutaArchivo) throws FileNotFoundException, IOException{
        File archivo = new File(rutaArchivo);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
//        this.nombre = br.readLine();
//        this.apellido = br.readLine();
//        this.notaFinal = Double.parseDouble(br.readLine());
//        
//        br.close();
        
        try {
            nombre = br.readLine();
            apellido = br.readLine(); 
            notaFinal = Double.parseDouble(br.readLine()); 
        } finally {
            br.close(); 
        }

    }
    
    public boolean verificarAprobacion(){
        return notaFinal >= 3.0;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nota Final: " + notaFinal);
        if (verificarAprobacion()){
            System.out.println("Resultado: Aprobado");
        }else{
            System.out.println("Resultado: Reprobado");
        }
        //System.out.println("Resultado: " + (verificarAprobacion() ? "Aprobado" : "Reprobado"));
    }
}
