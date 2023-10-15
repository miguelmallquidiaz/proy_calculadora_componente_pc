package config;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
	 public static Connection getConexion() {
	        Connection cn = null;
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");

	            cn = DriverManager.getConnection(CCadena.cadenaMySQL);
	            return cn;
	        } catch (SQLException e) {
	            System.out.println(String.valueOf(e));
	            return null;
	        } catch (ClassNotFoundException ex){
	             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
	             return null;
	        }
	            
	        
	    }
}
