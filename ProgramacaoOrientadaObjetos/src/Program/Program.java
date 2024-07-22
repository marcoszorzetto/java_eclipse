package Program;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qntProduto = 1;
		boolean condicao = true;
		Produto[] produto = new Produto[qntProduto];

		while (condicao) {

			System.out.println("\n\nEntrada de Produto  ........................... [ 1 ]\n"
					+ "Saída de Produto    ........................... [ 2 ]\n"
					+ "Consulta de Estoque ........................... [ 3 ]\n"
					+ "Sair do Sistema     ........................... [ 4 ]\n\n");

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:

				System.out.print("\n\nQuantidade de Itens: ");
				qntProduto = sc.nextInt();
				produto = new Produto[qntProduto];

				for (int i = 0; i < qntProduto; i++) {
					System.out.print("\n\nCódigo: ");
					int codigo = sc.nextInt();
					sc.nextLine();
					System.out.print("\nDescrição: ");
					String nome = sc.nextLine();
					System.out.print("\nPreço Unitário: ");
					double preco = sc.nextDouble();
					System.out.print("\nQuantidade: ");
					int quantidade = sc.nextInt();
					produto[i] = new Produto(nome, preco, codigo);
					produto[i].entradaProduto(quantidade);
					sc.nextLine();

				}

				break;

			case 2:
				System.out.print("Código: ");
				int codigo = sc.nextInt();
				for (int i = 0; i < 1; i++) {

					if (codigo == produto[i].getCodigo()) {

						System.out.print("Quantidade: ");
						int quantidade = sc.nextInt();
						if (quantidade <= produto[i].getQuantidade()) {

							produto[i].saidaProduto(quantidade);
							System.out.println("\nSaída efetuada com sucesso\n");

						} else {

							System.out.println("Não há estoque sufuciente");
						}
					} else {

						System.out.println("\nNão consta no estoque\n");
					}
				}

				break;

			case 3:

				for (int i = 0; i < qntProduto; i++) {

					System.out.println(produto[i]);
				}

				break;

			case 4:

				condicao = false;
				System.out.println("\n\nObrigado!");

				break;

			default:

				System.out.println("\n\nOpção Inválida\n\n");

				break;

			}

		}

		sc.close();

	}

}
