package unidade1;

import java.util.Scanner;

public class Calculadora {

	public static void dividir(int n1, int n2) throws ArithmeticException{
		
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digitie n1");
		int n1 = entrada.nextInt();
		System.out.println("Digite n2");
		int n2 = entrada.nextInt();
		try{
		dividir(n1, n2);
		}catch(Exception e){
			
			System.out.println("Erro divizao por zero");
		
		}
		
		
		
	}
	
}
