package Data;

public class DataTest {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2020;

		var d2 = new Data();
		d2.dia = 01;
		d2.mes = 05;
		d2.ano = 1995;

		System.out.printf("%d/%d/%d\n", d1.dia, d1.dia, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.dia, d2.ano);

	}

}
