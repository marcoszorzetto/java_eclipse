package Program;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Criar uma matriz com N linhas e N colunas, selecionar um elemento da matriz
		 * mostrar a(s) posição/posições em que aparece e mostrar os elementos a
		 * esquerda, direita, acima e abaixo de cada aparição na matriz
		 */

		int[][] numeros = new int[][] { { 1, 2, 3 }, { 4, 5, 7 }, { 7, 8, 9 } };

		boolean onOf = true;
		int[] direita = new int[1];
		int[] esquerda = new int[1];
		int[] abaixo = new int[1];
		int[] acima = new int[1];

		while (onOf) {

			System.out.println("\n\nCONSULTA GERAL------------------- [ 1 ]\n" + "CONSULTA ESPECÍFICA-------------- [ 2 ]\n"
					+ "SAIR DO SISTEMA------------------ [ 3 ]\n\n");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:

				for (int i = 0; i < 3; i++) {
					System.out.println();
					for (int j = 0; j < 3; j++) {

						System.out.printf(" %d ", numeros[i][j]);
					}
				}

				break;

			case 2:

				System.out.print("\n\nEntre com o número: ");
				int numeroPesquisa = sc.nextInt();
				boolean condicao = false;
				;
				for (int i = 0; i < 3; i++) {

					for (int j = 0; j < 3; j++) {

						if (numeroPesquisa == numeros[i][j]) {
							condicao = true;
							System.out.print("          _________________\n");
							System.out.print("         | Linha  | Coluna |\n");
							System.out.print("         |________|________|\n");
							System.out.printf("         |   %d    |   %d    |", i, j);
							System.out.print("\n         |________|________|\n");
						}

					}

					System.out.println();
				}

				if (condicao == false) {

					System.out.println("Não consta na Matriz");
				}

				break;
			case 3:
				onOf = false;
				System.out.println("\n\nObrigado\n\n");
				break;

			default:
				System.out.println("\n\nOpção inválida\n\n");
				break;

			}

		}
		sc.close();

	}

}
