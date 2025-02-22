package Program;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[3][3];// Instanciação da Matriz

		// coletando os dados para a matriz
		for (int linha = 0; linha < 3; linha++) {
			System.out.printf("Entre com os dados para o vetor #%d ( linha %d )\n", linha + 1, linha);
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Coluna #%d: ", coluna);
				numeros[linha][coluna] = sc.nextInt();
				if (numeros[linha][coluna] < 0) {

				}
			}
			System.out.println();
		}

		System.out.println();
		// for para imprimir
		for (int linha = 0; linha < 3; linha++) {
			System.out.printf("Vetor #%d( linha %d ): ", linha + 1, linha);
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf(" %d ", numeros[linha][coluna]);

			}
			System.out.println();
		}

		
		// imprimindo números negativos
		System.out.print("\n\nNúmeros negativos: ");
		for(int linha=0; linha < 3; linha++) {
			for(int coluna =0; coluna <3; coluna++) {
				if(numeros[linha][coluna] < 0) {
					
					System.out.printf(" %d ", numeros[linha][coluna]);
				}
			}
		}
		
		System.out.printf("\nDiagonal principal: ");
		for(int i=0; i<3; i++) {
			System.out.printf(" %d ", numeros[i][i]);
		}
		sc.close();

	}

}
