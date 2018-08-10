package unidade5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StramApp {
    static List<String> funcionarios;
    
    public static void filtrar(String letra){
    	funcionarios.stream().filter(s->s.startsWith(letra)).forEach(System.out::println);
    }
    
    public static void ordenar(String letra){
    	funcionarios.stream().sorted().filter(s->s.startsWith(letra)).forEach(System.out::println);
    }
    
    public static void contar(String letra){
    	long contador = funcionarios.stream().filter(s->s.startsWith(letra)).count();
    	System.out.println(contador);
    }
    
	public static void main(String[] args) {
		funcionarios = new ArrayList<>();
		funcionarios.add("Antonio");
		funcionarios.add("José");
		funcionarios.add("Pedro");
		funcionarios.add("João");
		funcionarios.add("Andreia");
		
		filtrar("A");
		ordenar("A");
		contar("A");
		
		
		
	}

}
