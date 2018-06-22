package unidade4.sisalucar;

import java.time.LocalDate;

public class Locacao {

	private long idLocacao;
	private long idCliente;
	private long idCarro;
	private float valorLocado;
	private LocalDate datainicial;
	private LocalDate datafinal;
	
	public long getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(long idLocacao) {
		this.idLocacao = idLocacao;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public float getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}

	public LocalDate getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(LocalDate datainicial) {
		this.datainicial = datainicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate datainicial,
			LocalDate datafinal) {
		super();
		this.idLocacao = idLocacao;
		this.idCliente = idCliente;
		this.idCarro = idCarro;
		this.valorLocado = valorLocado;
		this.datainicial = datainicial;
		this.datafinal = datafinal;
	}
	
	public Locacao(){
		
	}
}
