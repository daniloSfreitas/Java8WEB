package unidade2;

import javax.swing.SingleSelectionModel;

public class VetorAB {

	public static void main(String[] args) {
		
		int A [] = new int [50];
		int B [] = new int [50];
		
		for(int i=0; i<50; i++){
			A[i] = i;
			
			if(i%2 == 0)
			  B[i] = 2*A[i];
			else
		     B[i] = A[i]/2;
		}
            for(int a: A)
            	System.out.print(a+" ");
            System.out.println("");
            for(int b: B)
            	System.out.print(b+" ");
            
	}
}
