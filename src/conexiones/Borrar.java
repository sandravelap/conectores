package conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Files.Leer;


public class Borrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		try {
			Connection miCon=Conexion.conectar("acceso");
			nombre = Leer.pedirCadena("Introduce el nombre de la persona a borrar: ");
//			PreparedStatement borrar= miCon.prepareStatement("DELETE FROM `personas` WHERE `nombre` = 'merche'");
			PreparedStatement borrar= miCon.prepareStatement("DELETE FROM `personas` WHERE `nombre` = (?)");
			borrar.setString(1, nombre);
			borrar.executeUpdate();
		}catch (SQLException e){
			System.out.println("Excepción "+e);
		}
	}
}
