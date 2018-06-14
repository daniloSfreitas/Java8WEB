package unidade2;

import java.util.Scanner;

public class AplicacaoExpoente {

	public static void main(String[] args) {

		double e =0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("DIgite o valor de x");
		int x = scn.nextInt();
		
		
		for(int y =1; y<=50; y++)
			e = e + Math.pow(x, y)/y;
		
		System.out.printf("Valor de e(x)=%.2f",e);
		

	}

}
