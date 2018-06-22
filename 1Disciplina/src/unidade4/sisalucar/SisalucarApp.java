package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 10;
	
	static {
		System.out.println("inicializando");
		
	}

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setIdCarro(1);
		carro1.setModelo("gol");	
		carro1.setPlaca("jdk-0001");
		carro1.setCor("azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("volkswagen");	
		
		totalCarros = totalCarros + 1;	
		
		
		Carro carro2 = new Carro(1,"222");
		
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("Joao Pedro");
		cliente1.setCnh("xyz0001");	
				
		Cliente cliente2 = new Cliente();
		
		
		
	}
	
	public void realizarLocacao(long idCarro, long idClient){
		
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCarro(idClient);
		locacao.setIdLocacao(1);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);		
		
	}
	
	public  static void gerarRelatorioLocacao(LocalDate ...datas){
		
		float totalFaturado = 2 * 99.90f;
		
	}
	

}
