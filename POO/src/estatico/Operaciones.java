package estatico;

public class Operaciones {
    public static double celsius (double c1){
        double f1 = (c1*9/5)+32;
        return f1; 
    }
    
    public static double farhenheit (double f2){
        double c2= (f2-32)*5/9;
        return c2;
    }
    
    public static void main(String[] args) {
        System.out.println("La conversion de Celsius a Farhenheit es: "+Operaciones.celsius(30));
        
        System.out.println("La conversion de Farhenheit a celsius es: "+Operaciones.farhenheit(50));
    }
}
