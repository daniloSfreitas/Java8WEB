package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class CursoApp {

	public static void main(String[] args) {
		try 	
		{	
			
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long cdcurso, valor;
			String nome, url;
			CursoDAO dao = new CursoDAO();
			
			while(opcao != 6) {
				System.out.println("Sistema de Gerenciamento de Cursos");
				System.out.println("================================================");
				System.out.println("Digite 1 para Consultar Todos os Cursos");
				System.out.println("Digite 2 para Consultar um Cursos Especifico");
				System.out.println("Digite 3 para Cadastrar um Novo Curso");
				System.out.println("Digite 4 para Alterar um Curso");
				System.out.println("Digite 5 para Excluir um Curso");
				System.out.println("Digite 6 para Sair");
				System.out.println("================================================");
				opcao = entrada.nextInt();
				
				switch(opcao) {
				     case 1:{
				    	 System.out.println("Consultar todos os Cursos"); 
						   List<Curso> cursos = dao.findAll();
						   cursos.forEach(System.out::println);
					   break;
				   }
				     case 2:{
				    	 System.out.println("Consultar um Curso Especifico");
				    	 System.out.println("Informar o CDCruso");
						 cdcurso = entrada.nextLong(); 
				    	 System.out.println(dao.findA(cdcurso));
				    	 break;
					   }
				     case 3:{
				    	 System.out.println("Criar um Novo Curso");
				    	 System.out.println("Informar o CDCURSO:");
						 cdcurso = entrada.nextLong(); 
						 entrada.nextLine();
						 System.out.println("Informar o Nome:");
						 nome = entrada.nextLine();
						 System.out.println("Informar o valor:");
						 valor = entrada.nextLong();
						 entrada.nextLine();
						 System.out.println("Informar o url:");
						 url = entrada.nextLine();						 
						 Curso Curso = new Curso(cdcurso,nome,valor,url);
				    	 dao.persist(Curso);
				    	 break;
						   
					   }
				     case 4:{
				    	 System.out.println("Alterar um  Curso");
				    	 System.out.println("Informar o CDCURSO:");
						 cdcurso = entrada.nextLong(); 
						 entrada.nextLine();
						 System.out.println("Informar o Nome:");
						 nome = entrada.nextLine();
						 System.out.println("Informar o valor:");
						 valor = entrada.nextLong();
						 System.out.println("Informar o url:");
						 url = entrada.nextLine();						 
						 Curso Curso = new Curso(cdcurso,nome,valor,url);
						 dao.merge(Curso);
				    	 break;
						   
					   }
				     case 5:{
				    	 System.out.println("Expcluir um Curso Especifico");
				    	 System.out.println("Informar o CPF");
						 cdcurso = entrada.nextLong(); 
						 Curso Curso = dao.findA(cdcurso);
						 dao.delete(Curso);						 
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
