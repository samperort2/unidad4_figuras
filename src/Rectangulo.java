public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo(double l1, double l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public double obtenerArea(){
        return lado1*lado2;
    }
}
