package fundamentals.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 7.6;

		String resultadoFinal = media >= 7.0 ? "Aprovado." : "em recupera��o.";

		System.out.println("O aluno est�: " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		System.out.printf("Team desconto? %s",  resultado);

	}

}
