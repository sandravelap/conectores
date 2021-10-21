package conexiones;

import java.sql.*;

public class Conexion {
	
	private static final String URL="jdbc:mysql://localhost:3306/acceso";
	private static final String USUARIO = "developer";
	private static final String CLAVE = "alumno";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");
		}catch (SQLException e) {
			System.out.println("Error en la conexión");
		}
		return conexion;
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		Connection miCon = conectar();
		
	}

}
