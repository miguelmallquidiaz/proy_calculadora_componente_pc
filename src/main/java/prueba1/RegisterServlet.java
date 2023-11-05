package prueba1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
	        String lastname = request.getParameter("lastname");
	        String mail = request.getParameter("mail");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33065/innovabd", "root", "");
	            
	            String insertQuery = "INSERT INTO usuarios (nombre, apellido, correo, username, password) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(insertQuery);
	            ps.setString(1, name);
	            ps.setString(2, lastname);
	            ps.setString(3, mail);
	            ps.setString(4, username);
	            ps.setString(5, password);

	            int rowsAffected = ps.executeUpdate();

	            if (rowsAffected > 0) {
	                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	                rd.forward(request, response);
	            } else {
	                
	            	String message = "No se registro correctamente";
		            String redirect = "register.jsp";
		            String script = "alert('" + message + "'); window.location = '" + redirect + "';";
		            
		            response.setContentType("text/html");
		            response.getWriter().print("<script>" + script + "</script>");
	            }

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

