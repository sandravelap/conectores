package sqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CrearBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd = "biblioteca.db";
		Connection miCon = Conexion2.conectar(bd);
		String consulta="CREATE TABLE LIBRO";
		try {
			Statement crearBD = miCon.createStatement();
			crearBD.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
