package unidade4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylListApp {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Vermelhor");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		Collections.sort(lista);
        System.out.println(lista);	
		
	}

}
