package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Infome a medida");
		double media = sc.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabens!");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");

		}

		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;

		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}

		sc.close();

	}

}
