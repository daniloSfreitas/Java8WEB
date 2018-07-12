package unidade1;

import java.util.Formatter;
import java.util.Scanner;

public class Calculadora {

	public static void dividir(int n1, int n2) throws ArithmeticException{
		
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {
		
		String s = "hello123";
		Formatter f = new Formatter();
		f.format("%s", s);
		System.out.println(f);
		
	}
	
}
