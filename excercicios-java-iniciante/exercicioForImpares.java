import java.util.Locale;
import java.util.Scanner;

/* Leia um valor inteiro X (1 <= X <= 1000).
 * Em seguida mostre os �mpares de 1 at� X, 
 * um valor por linha, inclusive o X, se for o caso. */

public class exercicioForImpares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++)
			if (i % 2 != 0) {
				System.out.println(i);
			}
		sc.close();

	}

}
