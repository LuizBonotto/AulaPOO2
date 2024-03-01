public class Esfera implements Forma3D{
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
