package unidade4.com.abctreinamentos;

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
	
	

}
