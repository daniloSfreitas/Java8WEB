package unidade2;

public class AplicacaoFinonacci {

	public static void main(String[] args) {
		
		int anterior1 = 1;
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		int soma = anterior1 + anterior2 + calculado;
		System.out.print(anterior1+","+anterior2+","+calculado+",");
		
		for(int i=4; i<=20; i++){
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1+anterior2;
			soma = soma + calculado;
			System.out.print(calculado+",");
		
		} 
		double media = soma/20;
		System.out.println("Media="+media);
	}
}
