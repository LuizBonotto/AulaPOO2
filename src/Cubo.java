public class Cubo implements Forma3D {
    private double aresta;

    public  Cubo(double aresta) {
        this.aresta = aresta;
    }
    @Override
    public double area() {
        return 6 * Math.pow(aresta, 2);
    }
    @Override
    public double volume() {
        return Math.pow(aresta, 3);
    }
}
