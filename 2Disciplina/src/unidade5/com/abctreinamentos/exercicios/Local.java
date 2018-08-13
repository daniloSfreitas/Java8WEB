package unidade5.com.abctreinamentos.exercicios;

public class Local {
	static int num =1;
	public static void main(String[] args) {
		
		Converter<Integer, String> stringConverter = (from)-> String.valueOf(from + num);
		
		stringConverter.convert(2);
	}

}
