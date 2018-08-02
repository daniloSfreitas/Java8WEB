package unidade4;

import java.util.LinkedHashMap;

public class LinkedHashMapApp2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> mapa = new LinkedHashMap<>();
		mapa.put(4, "Bruno");
		mapa.put(2, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		System.out.println(mapa);
	}

}
