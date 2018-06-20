package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 10;
	
	static {
		System.out.println("inicializando");
		
	}

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.idCarro = 1;
		carro1.modelo = "gol";	
		carro1.placa = "jdk-0001";
		carro1.cor = "azul";
		carro1.ano = 2013;
		carro1.valorDiaria = 99.90f;
		carro1.fabricante = "volkswagen";	
		
		totalCarros = totalCarros + 1;	
		
		
		Carro carro2 = new Carro(1,"222");
		
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "12345678-90";
		cliente1.nome = "Joao Pedro";
		cliente1.cnh = "xyz0001";	
				
		Cliente cliente2 = new Cliente();
		
		
		
	}
	
	public void realizarLocacao(long idCarro, long idClient){
		
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCarro = idClient;
		locacao.idLocacao = 1;
		locacao.datainicial = LocalDate.now();
		locacao.datafinal = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;		
		
	}
	
	public  static void gerarRelatorioLocacao(LocalDate ...datas){
		
		float totalFaturado = 2 * 99.90f;
		
	}
	

}
