package unidade5.com.abctreinamentos;

import java.nio.file.Path;

public class Cursos {
	int cdCurso;
	String nome;
	float valor;
	Path url;
	public Cursos(int cdCurso, String nome, float valor, Path url) {
		super();
		this.cdCurso = cdCurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Cursos [nome=" + nome + "]";
	}
	public int getCdCurso() {
		return cdCurso;
	}
	public void setCdCurso(int cdCurso) {
		this.cdCurso = cdCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Path getUrl() {
		return url;
	}
	public void setUrl(Path url) {
		this.url = url;
	}
	
	

}
