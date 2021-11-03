package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.javatuples.Octet;


public class CrearBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd = "biblioteca.db";
		File archivo = new File("C:/sqlite/biblioteca.db");
		Octet<Integer, String, String, String, Integer, String, Integer, Integer> libro1 = Octet.with(1, "Titulo1", "Autor1", "Editorial1", 2020, "ISBN1", 3, 100);
		Octet<Integer, String, String, String, Integer, String, Integer, Integer> libro2 = Octet.with(2, "Titulo2", "Autor2", "Editorial2", 2020, "ISBN2", 4, 101);

		if (archivo.delete()){
			System.out.println("Archivo borrado");
		}
		Connection miCon = Conexion2.conectar(bd);
		String crearTablaLibro="CREATE TABLE LIBRO (CODIGO INT NOT NULL PRIMARY KEY, TITULO VARCHAR(15), "
				+ "AUTOR VARCHAR(20), EDITORIAL VARCHAR(15), AGNO INT, ISBN VARCHAR(20) NOT NULL UNIQUE,"
				+ "NUMEJEMPLARES INT, NUMPAGINAS INT)";
		String crearTablaSocio="CREATE TABLE SOCIO (COD_LIBRO INT NOT NULL PRIMARY KEY, NOMBRE VARCHAR(15), "
				+ "APELLIDOS VARCHAR(20), F_NAC DATE, DOMICILIO VARCHAR(30), TELEFONO VARCHAR(9))";
		String crearTablaPrestamo="CREATE TABLE PRESTAMO (COD_LIBRO INT NOT NULL FOREIGN KEY REFERENCESPRIMARY KEY, F_INI DATE, F_FIN DATE)";
		try {
			Statement crearBD = miCon.createStatement();
			crearBD.execute(crearTablaLibro);
			crearBD.execute(crearTablaSocio);
//			crearBD.execute(crearTablaPrestamo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
