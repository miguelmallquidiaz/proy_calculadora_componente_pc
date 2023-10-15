package modelo;

import config.Conexion;
import java.sql.*;


public class UsuarioDAO {

	public boolean Loguear(UUsuario oUsuario)throws ClassNotFoundException
	{
		Connection cn = Conexion.getConexion();
		PreparedStatement pst;
		ResultSet rs=null;
		int x=0;
		try {
			String vsql="select * from usuarios where username=? and password=?";
			pst = cn.prepareStatement(vsql);
			pst.setString(1, oUsuario.getUsername());
			pst.setString(2, oUsuario.getPassword());
			rs=pst.executeQuery();
			if(rs.absolute(1)) {
				return true;
			}
			return false;
		}catch(SQLException e){
			System.out.println(e.toString());
	        return false;
		}
	}
	
	public boolean insertarUsuario(UUsuario nusuario) {
		try {
			Connection cn = Conexion.getConexion();
			String vsql = "insert into usuarios values (?,?,?,?,?,?)";
			PreparedStatement pst = (PreparedStatement) cn.prepareStatement(vsql);
			pst.setInt(1,nusuario.getId()); 
            pst.setString(2,nusuario.getNombre());
            pst.setString(3,nusuario.getApellido());
            pst.setString(4,nusuario.getCorreo());
            pst.setString(5,nusuario.getUsername());
            pst.setString(6,nusuario.getPassword());
            
            int rpta = pst.executeUpdate();
            
            if(rpta==1){
                System.out.println("Registros insertados exitosamente:  "+ rpta);
                return true;
            }
            else {
                System.out.println("No se  inserto ningun dato");
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
		}
	}

