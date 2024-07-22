package Program;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[] {"Pedro", "Clara", "Simone", "Cíntia", "Helen", "Cristina"};
		
		
		// para cada objeto nome contido em nomes, faça
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		sc.close();

	}

}
