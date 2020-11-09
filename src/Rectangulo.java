public class Rectangulo extends FiguraRecta {
	private double alto, ancho;

	protected Rectangulo(double ancho, double alto) {
		super(new double[]{ancho, alto, ancho, alto});
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getArea() {
		return alto * ancho;
	}

}
