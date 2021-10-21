package sqlite;

import org.sqlite.jdbc4.*;

import java.sql.*;

public class Conexion{
	
	private static final String URL="jdbc:sqlite:C:/sqlite3/chinook.db";
//	private static final String USUARIO = "developer";
//	private static final String CLAVE = "alumno";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL);
			System.out.println("Conexión OK");
		}catch (SQLException e) {
			System.out.println("Error en la conexión" + e);
		}
		return conexion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Connection miCon = conectar();
	}

}
