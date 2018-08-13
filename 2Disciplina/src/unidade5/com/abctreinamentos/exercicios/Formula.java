package unidade5.com.abctreinamentos.exercicios;
@FunctionalInterface
public interface Formula {
	double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}

}
