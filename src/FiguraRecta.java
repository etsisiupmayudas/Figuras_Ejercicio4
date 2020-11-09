import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class FiguraRecta implements Figura{
    private double[] lados;

    public FiguraRecta(double[] lados) {
        this.lados = lados;
    }

    @Override
    public abstract double getArea();

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        for(double lado: lados){
            perimetro += lado;
        }
        return perimetro;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " [lados:(" + this.listarLados() +
                "), perímetro:" + this.getPerimetro() +
                ", área:" + this.getArea() + "]";
    }

    public double[] getLados() {
        return lados;
    }

    private String listarLados(){
        /* Java 8
        String listado = Arrays.stream(lados)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ,"));
        return listado;
        */
        String[] listado = new String[lados.length];
        for(int i=0; i<lados.length; i++){
            listado[i] = String.valueOf(lados[i]);
        }
        return String.join(", ", listado);
    }
}
