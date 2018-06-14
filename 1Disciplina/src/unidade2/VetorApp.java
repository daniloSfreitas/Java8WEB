package unidade2;

public class VetorApp {

	public static void main(String[] args) {
		int fibo[] = new int[20];
		fibo[0]=1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0]+fibo[1];
		
		for(int i=3;i<20;i++)
			fibo[i] = fibo[i-1]+fibo[i-2];
		
		for(int f: fibo)
			System.out.print(f+",");
		
		
		String vetor[] = new String[10];
		vetor[0] = new String("Antonio");
		vetor[1] = new String("Pedro");

		for(String v: vetor)
			System.out.print(v+",");
		
		int matriz[][] = new int [3][3];
		matriz[0][0] = 100;
	}

}
