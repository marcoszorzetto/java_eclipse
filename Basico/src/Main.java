import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Entre com a quantidade de notas: ");
		int qntNotas = sc.nextInt();
		double soma=0;
		double media=0;
		double[] notas = new double[qntNotas];
		
		for(int i=0; i< notas.length; i++) {
			System.out.printf("Entre com a nota #%d: ", i+1);
			notas[i] = sc.nextDouble();
			soma+= notas[i];
			media = soma/ notas.length;
			
		}
		
		
		System.out.printf("Média das notas: %.2f%n", media);
		sc.close();

	}

}
