package com.abctreinamentos;
// Generated 02/01/2019 22:48:06 by Hibernate Tools 4.3.5.Final



/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cpf;
	private String senha;

	public Login() {
	}

	public Login(long cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
	}

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
