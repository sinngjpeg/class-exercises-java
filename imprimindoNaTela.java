import java.util.Locale;

public class imprimindoNaTela {

	public static void main(String[] args) {

		/* converte o padrão da moeda para o local indicado nesse caso Locale.US */

		Locale.setDefault(Locale.US);

		double x = 10.35784;
		System.out.println(x);

		/*
		 * Formatação de casas decimais %2 - numeros de casas %n pula linha println -
		 * pula linha printf - print formatado
		 * 
		 */

		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		/*
		 * %s - string %d - double %.2f - formata numeros de casas %n - pula linha
		 */

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
	}

}
