package estatico;

public class Calculadora {

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println("Multiplicacion (directamente desde la clase): \n" + Calculadora.multiplicar(4, 6));
        
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();
        
        //Llamada al metodo estatico desde una instancia "No recomendado"
        System.out.println("Multiplicacion (Desde Instancia Calc1): \n"+calc1.multiplicar(4,5));
        System.out.println("Multiplicacion (Desde Instancia Calc2): \n"+calc2.multiplicar(6,7));
    
        //Llamada al metodo no estatico desde las instancias
        System.out.println("Suma (Desde la instancia Calc1): \n"+calc1.sumar(10, 20));
        System.out.println("Suma (Desde la instancia Calc2): \n"+calc2.sumar(40, 30));
    }
    
}
