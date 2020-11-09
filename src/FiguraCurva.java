import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class FiguraCurva implements Figura {
    private double[] radios;

    public FiguraCurva(double[] radios) {
        this.radios = radios;
    }

    @Override
    public double getArea() {
        return Math.PI * radios[0] * radios[1];
    }

    @Override
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return this.getClass().getName() +
                " [radios:(" + this.listarRadios() +
                "), perímetro:" + this.getPerimetro() +
                ", área:" + this.getArea() + "]";
    }

    public double[] getRadios() {
        return radios;
    }

    private String listarRadios(){
        /* Java 8
        String listado = Arrays.stream(radios)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ,"));
        return listado;
        */
        String[] listado = new String[radios.length];
        for(int i=0; i<radios.length; i++){
            listado[i] = String.valueOf(radios[i]);
        }
        return String.join(", ", listado);
    }

}
