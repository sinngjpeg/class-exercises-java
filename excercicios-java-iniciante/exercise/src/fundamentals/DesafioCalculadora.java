package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Informe o numero: ");
		double num2 = sc.nextDouble();

		System.out.println("Informe a operação: ");
		String op = sc.next();

		// Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 - num2 : resultado;
		resultado = "/".equals(op) ? num1 - num2 : resultado;
		resultado = "%".equals(op) ? num1 - num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2);

		sc.close();

	}

}
