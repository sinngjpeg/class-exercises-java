import java.util.Locale;
import java.util.Scanner;

public class areaDoTerreno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double largura, comprimento, area, metroQuadrado, preco;

		System.out.println("Digite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();

		area = largura * comprimento;
		System.out.printf("AREA: %.2f%n", area);
		preco = area * metroQuadrado;
		System.out.printf("PRECO: %.2f%n", preco);

		sc.close();

	}

}
