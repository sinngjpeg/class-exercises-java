import java.util.Locale;
import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a , b, soma;

		a = sc.nextInt();
		b = sc.nextInt(); 
		
		soma = a + b; 
		
		
		System.out.println("SOMA = " + soma);
		

	}

}
