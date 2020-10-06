package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Reinaldo");
		list.add("Joseph");
		list.add("Doe");
		list.add(2, "Marco");

		
		System.out.println(list.size());

		list.remove("Ana");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("Index Of Bob" + list.indexOf("Bob"));
		System.out.println("Index Of Bob" + list.indexOf("Marco"));

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("-----------------------------------------");
		System.out.println(name);

		
	}

}
