import java.util.Locale;
import java.util.Scanner;

public class exercicioMultiplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("sao multiplos");
		} else {
			System.out.println("nao sao multiplos");
		}

		sc.close();

	}

}
