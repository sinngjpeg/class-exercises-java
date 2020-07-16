import java.util.Locale;
import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {

		/*
		 * While - enquanto for verdade, repite a ação V: excecuta e volta, F: pula
		 * fora. Fazer um programa que le numeros inteiros ate que um zero seja lido. Ao
		 * final mostra a soma dos numeros lidos.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int soma = 0;
		int x = sc.nextInt();

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
