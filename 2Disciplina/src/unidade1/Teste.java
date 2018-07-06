package unidade1;

public class Teste {

	public static void main(String[] args) {
		int i=0;
		String frases[]={"um","dois","treus"};
		while(i<4){
			try{
				System.out.println(frases[1]);	
			
		}
			catch (ArrayIndexOutOfBoundsException e){
				
			System.out.println("Erro no acesso ao vetor");
			}
			
			i++;
	   }

	}

}
