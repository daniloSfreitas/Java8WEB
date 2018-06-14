package unidade2;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		int x = 0;
		//while (x < 10) {
			//System.out.println("x=" + x);
			//x++;
		//}
		//do {
		//	System.out.println("x=" + x);
			x++;
		//} while (x < 10); 
			 for(x=0;x<10;x++)
				 System.out.println("x="+x);
			 
			 int vetor[] ={1,2,3,4,5,6,7,8,9,0};
			 
			 for(int y: vetor)
				 System.out.println(y);
 
	}

}
