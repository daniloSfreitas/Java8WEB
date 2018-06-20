package unidade3.sisalucar;

public class Carro {

	long idCarro;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	String cor;
	float valorDiaria;
	Revendedor revendedo;
	
	public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria, Revendedor revendedor) {
		super();
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedo = revendedor;
	}
	
	public Carro(long idCarro, String placa){
		super();
		this.idCarro = idCarro;
		this.placa = placa;
	}
	
	public Carro(){
		
	}
	
	public static void main(String[ ] args) {
	  
		Carro carro1 = new Carro(1,"ABC-2001","volks","gol",2013,"azul",99.90f,Revendedor.EMANUELVAICULOS);
		
	
	}
}
