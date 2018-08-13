package unidade5.com.abctreinamentos.exercicios;

public class Something {

	
		String startWith(String s){
			return String.valueOf(s.charAt(0));
		}

		public static void main(String[] args) {
			
		
		Something something = new Something();
		Converter<String, String> converter = something::startWith;
		String converted = converter.convert("Java");
		System.out.println(converted);
		}
	}

