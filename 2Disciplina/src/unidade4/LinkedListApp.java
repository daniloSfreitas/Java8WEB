package unidade4;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<>();
		lista.add("Vermelhor");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		
		lista.removeFirst();
		lista.removeLast();
        System.out.println(lista);	
		
	}

}
