package controlador;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.UUsuario;
import modelo.UsuarioDAO;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



@WebServlet(name = "LoginControler", urlPatterns = {"/LoginControler"})



public class LoginControler extends HttpServlet {
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String accion;
		 RequestDispatcher dispatcher = null;
	     accion=request.getParameter("accion");
	     String usu=request.getParameter("username");
	     String cla=request.getParameter("password");
	     UUsuario oUsuario = new UUsuario();            
	     UsuarioDAO oUsuarioDAO= new UsuarioDAO(); 
	     	     
	     if ((accion==null)||accion.isEmpty())
	       {	    
	    	dispatcher=request.getRequestDispatcher("login.jsp");
	    	
	    	
	       } else if ("loguear".equals(accion)){
	         
	         	          
	          oUsuario.setUsername(usu);
	          oUsuario.setPassword(cla);
	           try {
	              
	               if (oUsuarioDAO.Loguear(oUsuario)){
	            	   dispatcher = request.getRequestDispatcher("index.jsp");
	                   request.setAttribute("username", usu);
	                   
	                   
	               }} catch(ClassNotFoundException ex) {
	               Logger.getLogger(LoginControler.class.getName()).log(Level.SEVERE, null, ex);
	           }
	       }else if ("nuevo".equals(accion))
	        {
	          
	    	   dispatcher = request.getRequestDispatcher("register.jsp");
	    	   
	            
	        }else if ("insert".equals(accion)){
	            
	              
	        
	            String nombre_ = request.getParameter("name");
	            String apellido_ = request.getParameter("lastname");	            
	            String correo_ = request.getParameter("mail");
	            String username_ = request.getParameter("username");
	            String password_ = request.getParameter("password");
	            
	            UUsuario nusuario = new UUsuario(0,nombre_,apellido_,correo_,username_,password_);
	            
	            oUsuarioDAO.insertarUsuario(nusuario);
	            
	            dispatcher = request.getRequestDispatcher("login.jsp");
	            
	             
	            
	        }
	    
	     dispatcher.forward(request, response);
	}
	
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          doGet(request,response);
    }
	
        @Override
	public String getServletInfo() {
        return "Short description";
    }
	
}

	


