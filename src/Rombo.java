public class Rombo extends FiguraRecta {
    private double diagonalMayor, diagonalMenor, lado, altura;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        super(new double[]{lado, lado, lado, lado});
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.altura = 0.0;
        this.lado = lado;
    }

    public Rombo(double lado, double altura){
        super(new double[]{lado, lado, lado, lado});
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        if(altura == 0.0)
            return (diagonalMayor * diagonalMenor)/2;
        else
            return lado * altura;
    }
}
