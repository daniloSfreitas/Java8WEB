package unidade4.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {
	
	static Map<Cliente,List<Cursos>> pagamentos = new HashMap<>();
	
	public static void main(String[] args) {
		
		//criar Curso
		Cursos java8 = new Cursos(1, "Java 8 para web", 2000, Paths.get("/java8"));
		Cursos Oracle12c = new Cursos(1, "Oracle 12c", 2500, Paths.get("/oracle12c"));
		Cursos php7 = new Cursos(1, "Php7", 1500, Paths.get("/php7"));
		// cadastro
		Cliente danilo = new Cliente("123.456.789-00", "Danilo da Silva", "dadas@dasda.com");
		//lista de curso
		List<Cursos> cursodanilo = new LinkedList<>();			
		Scanner entrada =new Scanner(System.in);
		int opcao = 0;
		while(opcao!=4){
			System.out.println("Qual curso deseja adquirir: [1-Java8],[2 oracle12c], [3 php7], [4 finalizar compra]");
		    opcao = entrada.nextInt();
		    if(opcao==1)
		    	cursodanilo.add(java8);
		    else if(opcao==2)
		    	cursodanilo.add(Oracle12c);
		    else if(opcao==3)
		    	cursodanilo.add(php7);
		    else
		    	opcao=4;
		    		    
		}
		entrada.close();
		pagamentos.put(danilo, cursodanilo);
		System.out.println(pagamentos );
	}

}
