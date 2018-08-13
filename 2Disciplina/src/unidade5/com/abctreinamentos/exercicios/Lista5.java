package unidade5.com.abctreinamentos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Lista5 {
	
	public static void main(String[] args) {
		
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		stringCollection
		 .stream()
		 .sorted()
		 .filter((s) -> s.startsWith("a"))
		 .forEach(System.out::println);
	}

}
