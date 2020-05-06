import java.util.Locale;
import java.util.Scanner;

public class ExercicioNPositivoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numero;
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}
