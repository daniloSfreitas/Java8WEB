package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaAPP {
    static int numero;
    int somatorio;
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
		LambdaAPP app = new LambdaAPP();		
		integers.forEach((Integer x)->{
			int y = x/2;
			System.out.println(y);
			numero = 10;
			x = x + numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);
			});
		System.out.println(app.somatorio);
	}

}
