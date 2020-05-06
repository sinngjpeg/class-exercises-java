
public class estruturaCondicionalIf {

	public static void main(String[] args) {

		/*
		 * REGRA: V: executa o bloco de comandos F: pula o bloco de comandos
		 */

		int x = 5;

		System.out.println("Bom dia");

		if (x > 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");

		System.out.println("Bom dia");

		if (x < 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");

	}

}