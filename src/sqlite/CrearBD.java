package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CrearBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd = "biblioteca.db";
		File archivo = new File("C:/sqlite/biblioteca.db");
		if (archivo.delete()){
			System.out.println("Archivo borrado");
		}
		Connection miCon = Conexion2.conectar(bd);
		String consulta="CREATE TABLE LIBRO (CODIGO INT NOT NULL PRIMARY KEY, TITULO VARCHAR(15), "
				+ "AUTOR VARCHAR(20), EDITORIAL VARCHAR(15), AGNO INT, ISBN VARCHAR(20) NOT NULL UNIQUE,"
				+ "NUMEJEMPLARES INT, NUMPAGINAS INT";
		try {
			Statement crearBD = miCon.createStatement();
			crearBD.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
