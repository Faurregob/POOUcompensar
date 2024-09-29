package clases.metodosabstraccion;
public class Main {
    public static void main(String[] args) {
        Planta planta1 = new Planta();
        planta1.alimentarse();
        
        
        SerVivo serv1 = new Planta();
        AnimalCarnivoro an1 = new AnimalCarnivoro();
        an1.alimentarse();
    }
    
            
}
