import java.util.Locale;
import java.util.Scanner;

public class exercicioLeituraSenhaUsandoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido");
		sc.close();

	}

}
