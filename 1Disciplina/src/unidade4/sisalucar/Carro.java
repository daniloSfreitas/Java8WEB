package unidade4.sisalucar;

public class Carro extends Veiculo{

	private long idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float  valorDiaria;
	private Revendedor revendedo;	
	
	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Revendedor getRevendedo() {
		return revendedo;
	}

	public void setRevendedo(Revendedor revendedo) {
		this.revendedo = revendedo;
	}

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
	  
		Carro carro1 = new Carro(1,"ABC-2001","volks","gol",2013,"azul",99.90f,Revendedor.ABCVEICULOS);
		Carro carro2 = new Carro();
		
		carro1.acelera();
		carro1.freita();
		carro1.getPassagueiro();
		carro1.getVelocidade();
		
		carro1.autonomia = 40;
	
	
	}
}
