import java.util.Locale;
import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = 5/2;
		System.out.printf("%d", (int)a);

		sc.close();

	}

}
