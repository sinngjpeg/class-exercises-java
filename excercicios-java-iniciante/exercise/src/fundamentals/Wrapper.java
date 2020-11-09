package fundamentals;

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer i = Integer.parseInt(sc.next()); // int

		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
	
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

		Character c = '#'; //char
		System.out.println(c + "...");
	}
}
