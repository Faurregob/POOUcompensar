package excepcion1;

import java.util.Scanner;

public class Excepciones1 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del dividendo");
        double dividendo, divisor;
        
            
        if(entradaTeclado.hasNextDouble()){
            dividendo = entradaTeclado.nextDouble();
        }else{
            System.out.println("El valor del dividendo no es double");
        }
        
                     
        System.out.println("Ingrese el valor del divisor");
        if (entradaTeclado.hasNextDouble()) {
            divisor = entradaTeclado.nextDouble();
        }else{
            System.out.println("El valor del divisor no es double");
        }
        
        
        
//        if (divisor!=0) {
//            double cociente = dividendo/divisor;
//            System.out.println("El resultado de la division es: " + cociente);
//        }else{
//            System.out.println("Estas ingresando el divisor con valor 0.");
//        }
        
        System.exit(0);
    }
}
