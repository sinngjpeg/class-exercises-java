package fundamentals;

public class TemperaturaConversao {

	public static void main(String[] args) {
		
		// (ºF - 32) x 5/9 = ºC
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		System.out.println(c);

	}

}
