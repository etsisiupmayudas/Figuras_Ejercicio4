public class Trapecio extends FiguraRecta{
    private double baseMayor, baseMenor, lado1, lado2;

    protected Trapecio(double baseMayor, double baseMenor, double lado) {
        this(baseMayor, baseMenor, lado, lado);
    }

    protected Trapecio(double baseMayor, double baseMenor, double lado1, double lado2) {
        super(new double[]{baseMayor, baseMenor, lado1, lado2});
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        double altura = Math.sqrt(Math.pow(lado1, 2) -
                        Math.pow((Math.pow(lado1, 2) - Math.pow(lado2, 2) +
                        Math.pow(baseMayor - baseMenor, 2))/2*(baseMayor - baseMenor), 2));
        return (baseMayor+baseMenor)/2*altura;
    }
}
