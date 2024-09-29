package estatico;

public class Estatico {

    private static String oracion = "Primera Oracion";

    public static int sumar(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    public static void main(String[] args) {
        //Estatico objeto1 = new Estatico();

        /*objeto1.oracion = "Hola";
        System.out.println(objeto1.oracion);

        //Estatico objeto2 = new Estatico();

        //objeto2.oracion = "Hi";
        //System.out.println(objeto2.oracion);*/
        
        /*Estatico.oracion ="Hola";
        System.out.println(Estatico.oracion);
        
        Estatico.oracion = "I'm here!";
        System.out.println(Estatico.oracion);
        System.out.println(Estatico.oracion);
        
        int adicion =Estatico.sumar(2,2);
        System.out.println("La suma es: "+adicion);*/
        
        oracion ="Hola";
        System.out.println(oracion);
        
        Estatico.oracion = "I'm here!";
        System.out.println(oracion);
        System.out.println(oracion);
        
        int adicion =sumar(2,2);
        System.out.println("La suma es: "+adicion);

    }
    
    
}
