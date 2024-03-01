public class Cilindro implements Forma3D {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    @Override
    public double area() {
        return 2 * Math.PI * raio * (raio + altura);
    }
    @Override
    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
