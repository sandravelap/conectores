package conexiones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd = "biblioteca";
		Connection miCon = Conexion.conectar("");
		String consulta="CREATE DATABASE "+ bd;
		try {
			Statement crearBD = miCon.createStatement();
			crearBD.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
