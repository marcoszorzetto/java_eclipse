import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner( System.in);
     System.out.println("Digite seu sexo ( m/f):");
     char sexo = sc.next().charAt(0);
     System.out.println("\nDigigte sua altura: ");
     double altura = sc.nextDouble();
     System.out.println("\nDigite seu peso: ");
     double peso = sc.nextDouble();
     sc.nextLine();// limpeza de buffer
     System.out.println("Digite seu nome: ");
     String nome = sc.nextLine();
     
     System.out.printf("Nome: %s\n"
     		         + "Altura: %.2f\n"
     		         + "Peso: %.2f\n"
     		         + "Sexo: %c", nome, altura, peso, sexo);
     
     sc.close();
	}

}
