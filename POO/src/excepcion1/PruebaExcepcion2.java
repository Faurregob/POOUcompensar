package excepcion1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PruebaExcepcion2 {

    
    public void leerArchivo() throws FileNotFoundException, IOException {
        //Excepcion verificada (IOException)

        FileReader fr = new FileReader("C:\\Users\\Freddy Urrego\\OneDrive\\Escritorio\\Programacion\\Ucompensar\\POOUcompensar\\Prueba\\Prueba.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea;
        
        br.close();

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }   
    
    public void leerArchivo2(){
        try {
            leerArchivo();
        }catch(FileNotFoundException ef){
            System.out.println("No se encuentra el archivo en la ubicacion mencionada."+"\n"+ef);
        }
        catch (IOException ex) {
            System.out.println("Ha ocurrido una Excepcion Verificada"+"\n"+ex);
        }
        
        System.out.println("Programa Terminado");
        
    }

    public static void main(String[] args) {
        PruebaExcepcion2 pe2 = new PruebaExcepcion2();
        
        pe2.leerArchivo2();
    }
   

}