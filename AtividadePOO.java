package atividades;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Henrique");
		names.add("Heitor");
		names.add("Susana");
		names.add("Arthur");
		names.add("Bruno");
		names.add("Camila");
		
		Collections.sort(names);
		
		System.out.println("Nomes em ordem alfabética:");
		for(String name: names) {
			System.out.println(name);
		}
	}
}