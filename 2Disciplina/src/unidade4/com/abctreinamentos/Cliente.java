package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	
	Set<Cursos> cursos;
	
	public static void main(String[] args) {
		
		Cursos java8 = new Cursos("java8");
		Cursos oracle12c = new Cursos("oracle12c");
		
		Set<Cursos> cursosA = new HashSet<>();
		Set<Cursos> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		
		cursosB.add(java8);

		
		//interseção
		//cursosA.retainAll(cursosB);
		//System.out.println("A intesec B");
		//System.out.println(cursosA);
		
		//cursosA.removeAll(cursosB);
		//System.out.println("A - B");
		//System.out.println(cursosA);
		
		cursosB.removeAll(cursosA);
		System.out.println("B - A");
		System.out.println(cursosB);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
		
		
		
	}

	public Set<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Cursos> cursos) {
		this.cursos = cursos;
	}

}
