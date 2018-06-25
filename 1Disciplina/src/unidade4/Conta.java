package unidade4;

import javax.swing.SingleSelectionModel;

public class Conta {
	
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente[];
	
	public boolean saca(double valor){
		if (valor <= saldo){
			saldo = saldo - valor;
			return true;
		}
		else		
		    return false;
	}

	public void deposita(double valor){
		saldo = saldo + valor;
		
	}
	
	public void transfere(Conta destino, double valor){
		
		if (valor <= saldo){
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			
		}
		else 
			System.out.println("Nao foi possival realizar a transferencia");
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = new Cliente[5];
	}

	

}
