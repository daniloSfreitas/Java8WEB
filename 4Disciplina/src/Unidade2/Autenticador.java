package Unidade2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Autenticador
 */
@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	static Connection conexao; 
	
    public Autenticador() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(url,usuario,senha);
			conexao.setAutoCommit(false);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpfmascara = request.getParameter("cpf");
		cpfmascara = cpfmascara.replaceAll("[.-]","");
		long cpf = Long.parseLong(cpfmascara);
		String senha = request.getParameter("senha");
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String consulta = "SELECT * FROM Login where cpf='"+cpf+"' and senha='"+senha+"'";
		Statement statement;
		HttpSession session = request.getSession();
		try {
			statement = conexao.createStatement();
			ResultSet rs = statement.executeQuery(consulta);
			if(rs.next()) // Usuario autenticado
			{
				session.setAttribute("mensagem", "Usuário Autenticado");
				response.sendRedirect("unidade3/sucesso.jsp");
				
			}
			else
			{
				session.setAttribute("mensagem", "Usuário Não Autenticado");
				response.sendRedirect("unidade3/login.jsp");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
