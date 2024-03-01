public class Quadrado implements Forma2D {
    private double lado;
    public Quadrado (double lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return lado*lado;
    }
}
