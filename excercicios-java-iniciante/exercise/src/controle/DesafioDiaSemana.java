package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do dia: ");

		String dia = sc.next();

		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if ("terca".equalsIgnoreCase(dia) || "ter�a".equalsIgnoreCase(dia)) {
			System.out.println(3);
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if ("sabado".equalsIgnoreCase(dia) || "s�bado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} else {
			System.out.println("Dia inv�lido!");
		}

		sc.close();

	}

}
