package com.abctreinamentos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	static Connection conexao; 
	/**********************************************************/
	public static void conectar() throws SQLException {
	/**********************************************************/	
		   conexao = DriverManager.getConnection(url,usuario,senha);
		   DatabaseMetaData meta = conexao.getMetaData();
		   conexao.setAutoCommit(false);
		   System.out.println(">>>>>>Conectado ao Banco de Dados"+meta.getDatabaseProductVersion());		   
	   }
	/*********************************************************/
	public static void desconectar() throws SQLException {		  
	/********************************************************/
		conexao.close();
	   }
	
	 /****************************************************************************************/	
    public static void inserir(Cliente cliente) throws SQLException {
    /****************************************************************************************/
         String sql ="insert into Cliente values("+cliente.getCpf()+",'"+cliente.getNome()+"','"+cliente.getEmail()+"')";
         Statement statement = conexao.createStatement();
         statement.execute(sql);
         conexao.commit();
    }
   
    /****************************************************************************************/
	public static Cliente consultar(long cpf) throws SQLException {
		/****************************************************************************************/
		String sql = "select * from Cliente where cpf="+cpf+"";
		Statement statement = conexao.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		Cliente cliente = null;
		while(rs.next()) {
			cliente = new Cliente(rs.getLong(1),rs.getString(2),rs.getString(3));
		}
		return cliente;		
	}
	/****************************************************************************************/
	public static List<Cliente> consultarTodos() throws SQLException{
		/****************************************************************************************/
		String sql = "select * from Cliente";
		Statement statement = conexao.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Cliente> clientes = new LinkedList<>();		
		while(rs.next()) {
			Cliente cliente = new Cliente(rs.getLong(1),rs.getString(2),rs.getString(3));
			clientes.add(cliente);
		   
		}
		return clientes;
	}
	/****************************************************************************************/
        public static void alterar(Cliente cliente) throws SQLException {
	   /****************************************************************************************/
	String sql = "update Cliente set nome='"+cliente.getNome()+"',email='"+cliente.getEmail()+"' where cpf="+cliente.getCpf();
	Statement statement = conexao.createStatement();
	statement.executeUpdate(sql);
	conexao.commit();
	}
      /****************************************************************************************/
      public static void excluir(long cpf) throws SQLException {	
	  /****************************************************************************************/
	String sql = "delete from Cliente where cpf="+cpf+"";
	Statement statement = conexao.createStatement();
	statement.executeUpdate(sql);
	conexao.commit();
	}

	

	
	
	
	public static void main(String[] args){
	
	try 	
	{	conectar();
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		long cpf;
		String nome, email;
		while(opcao != 6) {
			System.out.println("Sistema de Gerenciamento de Clientes");
			System.out.println("================================================");
			System.out.println("Digite 1 para Consultar Todos os Clientes");
			System.out.println("Digite 2 para Consultar um Clientes Especifico");
			System.out.println("Digite 3 para Cadastrar um Novo Cliente");
			System.out.println("Digite 4 para Alterar um Cliente");
			System.out.println("Digite 5 para Excluir um Cliente");
			System.out.println("Digite 6 para Sair");
			System.out.println("================================================");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			     case 1:{
			       System.out.println("Consultar todos os Clientes"); 
				   List<Cliente> clientes = ClienteDAO.consultarTodos();
				   clientes.forEach(System.out::println);
				   System.out.println("Numero de Clientes >>>>"+clientes.size()+"\n");
				   break;
			   }
			     case 2:{
			    	 System.out.println("Consultar um Cliente Especifico");
			    	 System.out.println("Informar o CPF");
					 cpf = entrada.nextLong(); 
			    	 Cliente cliente = ClienteDAO.consultar(cpf);
			    	 System.out.println(cliente);
			    	 break;
				   }
			     case 3:{
			    	 System.out.println("Criar um Novo Cliente");
			    	 System.out.println("Informar o Cpf:");
					 cpf = entrada.nextLong(); 
					 entrada.nextLine();
					 System.out.println("Informar o Nome:");
					 nome = entrada.nextLine();
					 System.out.println("Informar o Email:");
					 email = entrada.nextLine();
					 Cliente cliente = new Cliente(cpf,nome,email);
			    	 ClienteDAO.inserir(cliente);
					 	 break;
					   
				   }
			     case 4:{
			    	 System.out.println("Alterar um Cliente");
			    	 System.out.println("Informar o Cpf:");
					 cpf = entrada.nextLong(); 
					 entrada.nextLine();
					 System.out.println("Informar o Nome:");
					 nome = entrada.nextLine();
					 System.out.println("Informar o Email:");
					 email = entrada.nextLine();
					 Cliente cliente = new Cliente(cpf,nome,email);
			    	 ClienteDAO.alterar(cliente);
			    	 break;
					   
				   }
			     case 5:{
			    	 System.out.println("Expcluir um Cliente Especifico");
			    	 System.out.println("Informar o CPF");
					 cpf = entrada.nextLong(); 
			    	ClienteDAO.excluir(cpf);
			    	 break;
					   
				   }
			     case 6:{ 
					   System.out.println("Encerrando o Sistema....");
					   break;
				   }
			}
			
		}
		entrada.close();
		desconectar();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
		
	}
	
	

}
