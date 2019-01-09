package unidade3;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
	
	private List<String> nomes = new ArrayList<>();
	
	public Clientes(){
		
		nomes.add("Antonio");
		nomes.add("Benedito");
		nomes.add("Sampaio");	
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	
}
