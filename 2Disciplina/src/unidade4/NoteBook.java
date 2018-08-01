package unidade4;

import java.util.ArrayList;

public class NoteBook {

	 static ArrayList<String> anotacoes;
	
	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar Pão");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro às 11h30");
		
		double t1 = System.currentTimeMillis();
		
		for(int i =3; i <100003; i++)
			anotacoes.add("Texto_"+i);
		
		double t2 = System.currentTimeMillis();
		System.out.println((t2 - t1)/1000);
		//System.out.println(anotacoes);
		
		

	}

}
