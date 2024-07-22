import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] triangulos = new double[2][3];// matriz para representar os triângulos
		/* variáveis globais */
		double pX = 0;
		double pY = 0;
		double areaX = 0;
		double areaY = 0;
		/* for para coletar os dados */
		for (int triangulo = 0; triangulo < 2; triangulo++) {
			char t;
			if (triangulo == 0) {
				t = 'X';
			} else {
				t = 'Y';

			}
			System.out.printf("Entre com os dados para o triangulo%s\n", t);
			for (int lado = 0; lado < 3; lado++) {
				char l;
				if (lado == 0) {
					l = 'A';
				} else if (lado == 1) {
					l = 'B';
				} else {
					l = 'C';
				}

				System.out.printf("Lado %s : ", l);
				triangulos[triangulo][lado] = sc.nextDouble();

				if (triangulo == 0) {
					pX += (triangulos[triangulo][lado]) / 2;
					areaX = Math.sqrt(pX * (pX - triangulos[0][0]) * (pX - triangulos[0][1]) * (pX - triangulos[0][2]));
				} else {
					pY += (triangulos[triangulo][lado]) / 2;
					areaY = Math.sqrt(pY * (pY - triangulos[1][0]) * (pY - triangulos[1][1]) * (pY - triangulos[1][2]));
				}
			}
		}

		String areaMaior = areaX > areaY ? "trianguloX possui área maior" : "trianguloY posui a área maior";

		System.out.printf("\n\nÁrea do trianguloX: %.4f\n\n" + "Área do trianguloY: %.4f\n\n", areaX, areaY);

		System.out.printf("\n%s", areaMaior);

		/* Resolvendo com a classe Triangulo */

		Triangulo x, y;
		System.out.print("\n\nEntre com os dados para o trianguloX\nLadoA: ");
		double ladoXa = sc.nextDouble();
		System.out.print("\nEntre com os dados para o trianguloX\nLadoB: ");
		double ladoXb = sc.nextDouble();
		System.out.print("\nEntre com os dados para o trianguloX\nLadoC: ");
		double ladoXc = sc.nextDouble();
		x = new Triangulo(ladoXa, ladoXb, ladoXc);
		double areaTrianguloX=x.area();

		System.out.print("\nEntre com os dados para o trianguloY\nLadoA: ");
		double ladoYa = sc.nextDouble();
		System.out.print("\nEntre com os dados para o trianguloY\nLadoB: ");
		double ladoYb = sc.nextDouble();
		System.out.print("\nEntre com os dados para o trianguloY\nLadoC: ");
		double ladoYc = sc.nextDouble();
		y = new Triangulo(ladoYa, ladoYb, ladoYc);

		double areaTrianguloY=y.area();
       
		
		System.out.println(x);
		System.out.println(y);
		areaMaior(areaTrianguloX, areaTrianguloY);
		

		sc.close();

	}

	
	
	
	public static void areaMaior(double areaX, double areaY) {
		double area;
		char triangulo;
		if (areaX > areaY) {

			triangulo = 'X';
		} else {

			triangulo = 'Y';
		}

	
		System.out.printf("Área maior: triangulo%c", triangulo);
	}

}
