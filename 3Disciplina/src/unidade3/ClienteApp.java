package unidade3;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ClienteApp {

	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	static Connection conexao; 
	/**********************************************************/
	public static void conectar() throws SQLException {
	/**********************************************************/	
		   conexao = DriverManager.getConnection(url,usuario,senha);
		   conexao.setAutoCommit(false);
	   }
	/*********************************************************/
	public static void desconectar() throws SQLException {		  
	/********************************************************/
		conexao.close();
	   }
    /****************************************************************************************/	
    public static void inserirPS(long cpf,String nome,String email) throws SQLException {
    /****************************************************************************************/
    	String sql = "insert into Cliente values(?,?,?)";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setLong(1, cpf);
		statement.setString(2, nome);
		statement.setString(3, email);
		statement.executeUpdate();
		conexao.commit();
	}
    
    /****************************************************************************************/	
    public static void inserirSP(long cpf,String nome,String email) throws SQLException {
    /****************************************************************************************/
    	String sql = "{call sp_inserircliente(?,?,?)}";
    	CallableStatement cstmt = conexao.prepareCall(sql);		
		cstmt.setLong(1, cpf);
		cstmt.setString(2, nome);
		cstmt.setString(3, email);
		cstmt.execute();
		conexao.commit();
	}
    
    /****************************************************************************************/
	public static void consultar(long cpf) throws SQLException {
		/****************************************************************************************/
		String sql = "select * from Cliente where cpf="+cpf+"";
		Statement statement = conexao.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			System.out.println("cpf:"+rs.getInt(1)+
					" nome:"+rs.getString(2)+ " email:"+rs.getString(3));
		}
		
		
	}
	/****************************************************************************************/
	public static void consultarTodos() throws SQLException{
		/****************************************************************************************/
		String sql = "select * from Cliente";
		Statement statement = conexao.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		int contador = 0;
		while(rs.next()) {
			System.out.println("cpf:"+rs.getInt(1)+
					" nome:"+rs.getString(2)+ " email:"+rs.getString(3));			
			System.out.println("=======================================");
		}
		System.out.println("Numero de Clientes listatdos>>"+contador+"\n");
	}
	/****************************************************************************************/
        public static void alterar(long cpf,String nome,String email) throws SQLException {
	   /****************************************************************************************/
	String sql = "update Cliente set nome='"+nome+"',email='"+email+"' where cpf="+cpf;
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
				   consultarTodos();
				   break;
			   }
			     case 2:{
			    	 System.out.println("Consultar um Cliente Especifico");
			    	 System.out.println("Informar o CPF");
					 cpf = entrada.nextLong(); 
			    	 consultar(cpf);
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
			    	 //inserir(cpf, nome, email);
					 //inserirPS(cpf, nome, email);
					 inserirSP(cpf, nome, email);
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
			    	 alterar(cpf, nome, email);
			    	 break;
					   
				   }
			     case 5:{
			    	 System.out.println("Expcluir um Cliente Especifico");
			    	 System.out.println("Informar o CPF");
					 cpf = entrada.nextLong(); 
			    	 excluir(cpf);
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
