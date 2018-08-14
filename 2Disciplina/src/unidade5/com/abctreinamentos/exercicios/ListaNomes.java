package unidade5.com.abctreinamentos.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaNomes {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("peter", "anna", "mike","xenia");
		
		Collections.sort(names, (a, b)-> a.compareTo(b));
		
		for(String name : names)
			System.out.println(name);
		
	}

}
