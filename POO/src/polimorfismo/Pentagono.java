package polimorfismo;

public class Pentagono extends Figura{
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public double calcularArea() {
        return 1.72048 * Math.pow(lado, 2);
    }
    
    
}
