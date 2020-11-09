public class Elipse extends FiguraCurva {
	private double radioMayor, radioMenor;

	protected Elipse(double radioMayor, double radioMenor) {
		super(new double[]{radioMayor, radioMenor});
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public double getPerimetro() {
		// fórmula Ramanujan II, valor aproximado
		double H = Math.pow((radioMayor - radioMenor)/(radioMayor + radioMenor), 2);
		return Math.PI * (radioMayor + radioMenor)*(1+(3*H/(10+Math.sqrt(4-3*H))));
	}
}
