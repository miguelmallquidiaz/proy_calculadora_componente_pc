package prueba1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33065/innovabd", "root", "");
			
			String n = request.getParameter("username");
			String p = request.getParameter("password");
			
			PreparedStatement ps = con.prepareStatement("select * from usuarios where username=? and password=?");
			ps.setString(1,n);
			ps.setString(2,p);
			ResultSet rs = ps.executeQuery(); 
			if(rs.next()) 
			{
				HttpSession session = request.getSession();
                session.setAttribute("username", n);
                
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request,response);
			}else {
				String message = "Contraseña incorrecta";
	            String redirect = "login.jsp";
	            String script = "alert('" + message + "'); window.location = '" + redirect + "';";
	            
	           
	            response.setContentType("text/html");
	            response.getWriter().print("<script>" + script + "</script>");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		};
	}

}
