package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Infome a medida");
		double media = sc.nextDouble();
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		sc.close();

	}

}
