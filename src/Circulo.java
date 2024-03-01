public class Circulo implements Forma2D{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
