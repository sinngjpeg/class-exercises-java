package Classe;

public class ProdutoTest {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 1200.00;
		p1.desconto = 0.25;

		var p2 = new Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 1.20;
		p2.desconto = 0.25;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrio = (precoFinal1 + (precoFinal2) / 2);

		System.out.printf("Media do carrinho = R$%.2f", mediaCarrio);
	}

}
