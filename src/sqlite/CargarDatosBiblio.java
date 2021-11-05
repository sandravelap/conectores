package sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;

import org.javatuples.Octet;
import org.javatuples.Sextet;

public class CargarDatosBiblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd = "biblioteca.db";
		Date f = new Date(946684800000L);
		File archivo = new File("C:/sqlite/biblioteca.db");
		Octet<Integer, String, String, String, Integer, String, Integer, Integer> libro1 = Octet.with(1, "Titulo1", "Autor1", "Editorial1", 2020, "ISBN1", 3, 100);
		Octet<Integer, String, String, String, Integer, String, Integer, Integer> libro2 = Octet.with(2, "Titulo2", "Autor2", "Editorial2", 2020, "ISBN2", 4, 101);
		Sextet<Integer, String, String, Date, String, String> socio1 = Sextet.with(1, "Socio1", "Ape1", f, "dom1", "tfno1");
		Sextet<Integer, String, String, Date, String, String> socio2 = Sextet.with(2, "Socio2", "Ape2", f, "dom2", "tfno2");
		
		// creamos la conexión y cargamos los datos:
		Connection miCon = Conexion2.conectar(bd);
	}

}
