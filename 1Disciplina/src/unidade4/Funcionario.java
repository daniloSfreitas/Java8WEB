package unidade4;

import javax.swing.SingleSelectionModel;

public class Funcionario {
	
	public static void main(String[] args) {
		
		Funcionario jose = new Funcionario();
		Funcionario antonio = new Professor();
	    Funcionario andrea = new Administrativo();
	    Funcionario pedro = new Diretor();
	    pedro.verificarTipoFuncionario(pedro);
	}
	
	void verificarTipoFuncionario(Funcionario objeto){
		
		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		else if(objeto instanceof Professor)
			System.out.println("Professor");
		else 
			System.out.println("Administtrativo");
		
		
	}

}
