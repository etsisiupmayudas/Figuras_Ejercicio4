public class Triangulo extends FiguraRecta{

    public Triangulo(double lado) {
        // Equiláterio
        super(new double[]{lado, lado, lado});
    }

    public Triangulo(double lado1, double lados2y3) {
        // Isósceles
        super(new double[]{lado1, lados2y3, lados2y3});
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        // Escaleno
        super(new double[]{lado1, lado2, lado3});
    }

    @Override
    public double getArea() {
        // Fórmula de Herón
        double[] lados = getLados();
        double s = getPerimetro()/2;
        return Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2]));
    }
}
