package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramListas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		  Dados dos mesmo tipos, ordenadas, inicia vazia Tipo List ( interface ) Para
		  instanciar um tipo List é preciso usar uma classe que faça a implementação
		  Classes possíveis: ArrayList, LinkedList, etc Vantagens: tamanho é variável,
		  facilidade para realizar inserções e deleções Desvantagens: Acesso sequencial
		  aos elementos Lista não aceita tipos primitivos
		 */

		// Instanciação de uma Lista
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Renata");
		nomes.add("Rafaela");
		nomes.add("Cíntia"); // inserindo um elemento em uma posição específica
		nomes.add(2, "Marcos"); // consultando o tamanho da lista
		System.out.println(nomes.size());

		// usando um foreach 
		for (String nome : nomes) {

		System.out.printf(" %s ", nome);}
	

	// removendo elemento da lista 
		nomes.remove("Cíntia"); 
		nomes.remove(1);
	// removendo da lista elementos que atendem um predicado
		nomes.removeIf(x ->	x.charAt(0)=='M');// função lambda ( função anônima )

	   System.out.println(); // usando um foreach 
	   for (String nome : nomes) {

	   System.out.printf(" %s ",nome);}

	// encontrando a posição de um determinado elemento
	System.out.printf("\nPosição da Fernanda: %d",nomes.indexOf("Fernanda")); 
	// procurando um elemento que não existe na lista
	System.out.printf("\nPosição da Creusa na lista ( não está na lista ): %d",nomes.indexOf("Creusa"));

	// filtrando na lista determinados elementos
	List<String> filtro = nomes.stream().filter(x->x.charAt(0)=='R').collect(Collectors.toList());
	// converte-se para stream, executa o predicado ( função lambda ) e retorna em List
	

	System.out.println(); // usando o foreach 
	for(String nomesFiltrados: filtro)
	{
		System.out.printf(" %s ", nomesFiltrados);
	}

	// Lista 2

	List<String> sobrenomes = new ArrayList<>();sobrenomes.add("Zorzetto");sobrenomes.add("Silva");sobrenomes.add("Tarateta");sobrenomes.add("Moura");sobrenomes.add("Pereira");sobrenomes.add("Berdinazzi");sobrenomes.add("Mezzenga");sobrenomes.add("Antrione");sobrenomes.add("Viccenzo");for(
	String sobrenome:sobrenomes)
	{

		System.out.println(sobrenome);
	} 
	
	
	 // encontrando o primeiro elemento que atenda um predicados
		  System.out.print("\n\n\nEntre com uma letra para encontrarmos elementos que comecem com ela: ");
	char letra = sc.next().charAt(0);
	String nome = sobrenomes.stream().filter(x -> x.charAt(0) == letra).findFirst()
			.orElse("Não existe");System.out.printf("\nPrimeiro elemento encontrado com a letra %s: %s",letra,nome);

	sc.close();

}

}
