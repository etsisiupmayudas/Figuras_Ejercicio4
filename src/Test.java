import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {

		Figura[] figuras = {
			new Rectangulo(3,5), new Rectangulo(3.5,5.5),
			new Cuadrado(3), new Cuadrado(5.5),
			new Rombo(7,6), new Rombo(5.0,3.0, 4.0),
			new Trapecio(4, 3, 2), new Trapecio(4.5, 3.5, 2.5),
			new Triangulo(4, 3, 5), new Triangulo(4.5, 3.5, 5.5),
			new Triangulo(4), new PoligonoRegular(new double[]{4, 4, 4}),
			new Cuadrado(3), new PoligonoRegular(new double[]{3, 3, 3, 3}),
			new PentagonoR(5), new PentagonoR(5.6),
			new HexagonoR(3), new HexagonoR(3.1),
			new Circulo(2), new Circulo(2.5),
			new Elipse(3, 2), new Elipse(2.5, 2.5)
		};

		AnalizadorFiguras analizador = new AnalizadorFiguras(figuras);

		System.out.println();
		System.out.println("Resulados del analizador de las figuras");
		System.out.println("---------------------------------------");

		for(Figura f: figuras) {
			System.out.println(f.toString());
		}
		System.out.println();
		System.out.println(analizador.resumenPerimetros());
		System.out.println(analizador.resumenAreas());

		DecimalFormat df = new DecimalFormat("#.0000");

		System.out.println();
		System.out.println("Total perímetros: " + df.format(analizador.calculaTotalPerimetros()));
		System.out.println("Media perímetros: " + df.format(analizador.calculaMediaPerimetros()));
		System.out.println("Máximo perímetros: " + df.format(analizador.calculaMaximoPerimetros()));
		System.out.println("Mínimo perímetros: " + df.format(analizador.calculaMinimoPerimetros()));
		System.out.println("Total áreas: " + df.format(analizador.calculaTotalAreas()));
		System.out.println("Media áreas: " + df.format(analizador.calculaMediaAreas()));
		System.out.println("Máximo áreas: " + df.format(analizador.calculaMaximoAreas()));
		System.out.println("Mínimo áreas: " + df.format(analizador.calculaMinimoAreas()));
		System.out.println();
	}

}
