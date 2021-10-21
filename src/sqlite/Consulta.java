package sqlite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miConexion =Conexion.conectar(); //nos conectamos
		String miConsulta = "SELECT TrackId, name, Milliseconds FROM tracks";
		try {
			Statement stmt = miConexion.createStatement(); //creamos la consulta
			ResultSet rs = stmt.executeQuery(miConsulta); //ejecutamos la consulta
			
			//mostramos los resultados
			while (rs.next()) {
				System.out.println("Track: "+rs.getInt("TrackId")+
						" nombre: "+ rs.getString("name")+
						" duración: " + rs.getInt("Milliseconds"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
