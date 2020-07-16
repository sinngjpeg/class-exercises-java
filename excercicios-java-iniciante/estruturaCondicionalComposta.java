import java.util.Scanner;

public class estruturaCondicionalComposta {

	public static void main(String[] args) {

		/*
		 * REGRA V: executa somente o bloco do if F: executa somente o bloco do else
		 */

		Scanner sc = new Scanner(System.in);

		int hora = 5;
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}

		else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			}
		}
		System.out.println("Boa noite");

		sc.close();

	}
}
