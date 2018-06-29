package unidade4;

import javax.swing.SingleSelectionModel;

public abstract class Funcionario {
	
	public static void main(String[] args) {
		
		
	    
	}
	
	
	public abstract void getBonificacao();
	
	void verificarTipoFuncionario(Funcionario objeto){
		
		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		else if(objeto instanceof Professor)
			System.out.println("Professor");
		else 
			System.out.println("Administtrativo");
		
		
	}

}
