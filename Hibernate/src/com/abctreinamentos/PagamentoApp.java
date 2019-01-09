package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class PagamentoApp {

	public static void main(String[] args) {
		try 	
		{	
			
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long cpf, cdcurso;
			String datainscricao;
			PagamentoDAO dao = new PagamentoDAO();
			
			while(opcao != 6) {
				System.out.println("Sistema de Gerenciamento de Pagamentos");
				System.out.println("================================================");
				System.out.println("Digite 1 para Consultar Todos os Pagamentos");
				System.out.println("Digite 2 para Consultar um Pagamentos Especifico");
				System.out.println("Digite 3 para Cadastrar um Novo Pagamento");
				System.out.println("Digite 4 para Alterar um Pagamento");
				System.out.println("Digite 5 para Excluir um Pagamento");
				System.out.println("Digite 6 para Sair");
				System.out.println("================================================");
				opcao = entrada.nextInt();
				
				switch(opcao) {
				     case 1:{
				       System.out.println("Consultar todos os Pagamentos"); 
				       List<Pagamento> pagamentos = dao.findAll();
					   pagamentos.forEach(System.out::println);
					   break;
				   }
				     case 2:{
				    	 System.out.println("Consultar um Pagamento Especifico");
				    	 System.out.println("Informar o CPF");
						 cpf = entrada.nextLong(); 
						 System.out.println("Informar o CDCURSO");
						 cdcurso = entrada.nextLong(); 
				    	PagamentoId pgtoid = new PagamentoId(cpf, cdcurso);
				    	System.out.println(dao.findA(pgtoid));						 						 
				    	 break;
					   }
				     case 3:{
				    	 System.out.println("Criar um Novo Pagamento");
				    	 System.out.println("Informar o CPF");
						 cpf = entrada.nextLong(); 
						 System.out.println("Informar o CDCURSO");
						 cdcurso = entrada.nextLong(); 
						 PagamentoId pgtoid = new PagamentoId(cpf, cdcurso);
						 entrada.nextLine();
						 System.out.println("Infromar a DATA DE INSCRICAO");
						 datainscricao = entrada.nextLine();
				    	 Pagamento Pagamento = new Pagamento(pgtoid,datainscricao);
				    	 dao.persist(Pagamento);
				    	 break;
						   
					   }
				     case 4:{
				    	 System.out.println("Criar um Novo Pagamento");
				    	 System.out.println("Informar o CPF");
						 cpf = entrada.nextLong(); 
						 System.out.println("Informar o CDCURSO");
						 cdcurso = entrada.nextLong(); 
						 PagamentoId pgtoid = new PagamentoId(cpf, cdcurso);
						 entrada.nextLine();
						 System.out.println("Infromar a DATA DE INSCRICAO");
						 datainscricao = entrada.nextLine();
				    	 Pagamento Pagamento = new Pagamento(pgtoid,datainscricao);
				    	 dao.merge(Pagamento);
				    	 break;
						   
					   }
				     case 5:{
				    	 System.out.println("Consultar um Pagamento Especifico");
				    	 System.out.println("Informar o CPF");
						 cpf = entrada.nextLong(); 
						 System.out.println("Informar o CDCURSO");
						 cdcurso = entrada.nextLong(); 
				    	 PagamentoId pgtoid = new PagamentoId(cpf, cdcurso);
				    	 Pagamento Pagamento = dao.findA(pgtoid);
						 dao.delete(Pagamento);						 
				    	 break;
						   
					   }
				     case 6:{ 
						   System.out.println("Encerrando o Sistema....");
						   break;
					   }
				}
				
			}
			entrada.close();
					
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
			
		}

}
