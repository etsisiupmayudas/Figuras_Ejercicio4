public class AnalizadorFiguras {

	private Figura[] figuras;
	private double[][] infoFiguras;

	private final int PERIMETROS = 0, AREAS = 1;
	private final int SUM = 0, AVG = 1, MIN = 2, MAX = 3;

	public AnalizadorFiguras(Figura[] figuras) {
		this.figuras = figuras;
		this.infoFiguras = new double[2][4];
		this.generaInfoPerimetros();
		this.generaInfoAreas();
	}

	private void generaInfoPerimetros(){
		double suma = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double tmp = 0;
		for(Figura f: figuras){
			tmp = f.getPerimetro();
			suma += tmp;
			if (tmp > max)
				max = tmp;
			if (tmp < min)
				min = tmp;
		}
		this.infoFiguras[PERIMETROS][SUM] = suma;
		this.infoFiguras[PERIMETROS][AVG] = suma / figuras.length;
		this.infoFiguras[PERIMETROS][MAX] = max;
		this.infoFiguras[PERIMETROS][MIN] = min;
	}

	private void generaInfoAreas(){
		double suma = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double tmp = 0;
		for(Figura f: figuras){
			tmp = f.getArea();
			suma += tmp;
			if (tmp > max)
				max = tmp;
			if (tmp < min)
				min = tmp;
		}
		this.infoFiguras[AREAS][SUM] = suma;
		this.infoFiguras[AREAS][AVG] = suma / figuras.length;
		this.infoFiguras[AREAS][MAX] = max;
		this.infoFiguras[AREAS][MIN] = min;
	}

	public String resumenPerimetros(){
		return "Resumen perímetros {"+
				"sum="+this.infoFiguras[PERIMETROS][SUM]+
				", avg="+this.infoFiguras[PERIMETROS][AVG]+
				", max="+this.infoFiguras[PERIMETROS][MAX]+
				", min="+this.infoFiguras[PERIMETROS][MIN]+"}";
	}

	public String resumenAreas(){
		return "Resumen áreas {"+
				"sum="+this.infoFiguras[AREAS][SUM]+
				", avg="+this.infoFiguras[AREAS][AVG]+
				", max="+this.infoFiguras[AREAS][MAX]+
				", min="+this.infoFiguras[AREAS][MIN]+"}";
	}

	public double calculaMediaPerimetros() {
		return this.infoFiguras[PERIMETROS][AVG];
	}

	public double calculaMaximoPerimetros() {
		return this.infoFiguras[PERIMETROS][MAX];
	}

	public double calculaMinimoPerimetros() {
		return this.infoFiguras[PERIMETROS][MIN];
	}

	public double calculaTotalPerimetros() {
		return this.infoFiguras[PERIMETROS][SUM];
	}

	public double calculaMediaAreas() {
		return this.infoFiguras[AREAS][AVG];
	}

	public double calculaMaximoAreas() {
		return this.infoFiguras[AREAS][MAX];
	}

	public double calculaMinimoAreas() {
		return this.infoFiguras[AREAS][MIN];
	}

	public double calculaTotalAreas() {
		return this.infoFiguras[AREAS][SUM];
	}
}
