package fundamentals;

public class TipoString {
	public static void main(String[] args) {
	
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia!"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.789;
		
		System.out.println("Nome " + nome + " Sobranome: " + sobrenome + " Idade: " + idade + " Salario: " + salario);
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
