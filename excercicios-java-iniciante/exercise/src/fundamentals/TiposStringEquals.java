package fundamentals;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner sc = new Scanner(System.in);

		String s2 = sc.next();
		System.out.println("2".equals(s2));

		sc.close();

	}

}
