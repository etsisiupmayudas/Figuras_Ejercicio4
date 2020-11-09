public class Circulo extends FiguraCurva {
	private double radio;

	protected Circulo(double radio) {
		super(new double[]{radio, radio});
		this.radio = radio;
	}

	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public String toString() {
		String cadena = super.toString().substring(super.toString().indexOf("s:("),super.toString().indexOf(")")+1);
		return super.toString().replace(cadena, ":"+radio);
	}
}
