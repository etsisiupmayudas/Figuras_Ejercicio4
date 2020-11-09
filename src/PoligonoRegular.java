public class PoligonoRegular extends FiguraRecta{
    private int numLados;
    private double lado;

    public PoligonoRegular(double[] lados) {
        super(lados);
        this.lado = lados[0];
        this.numLados = lados.length;
    }

    @Override
    public double getArea() {
        double apotema, anguloCentral;
        anguloCentral = 360/numLados;
        apotema = lado/(2*Math.tan(Math.toRadians(anguloCentral/2)));
        return (getPerimetro() * apotema)/2;
    }
}
