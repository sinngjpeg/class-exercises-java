import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println();
		System.out.println("Voce digitou: " + x);
		System.out.println();

		int z;
		z = sc.nextInt();
		System.out.println();
		System.out.println("Voce digitou: " + z);

		double w;
		w = sc.nextDouble();
		System.out.println();
		System.out.println("Voce digitou: " + w);

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(z);
		System.out.println(w);

		String s1, s2, s3;

		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
