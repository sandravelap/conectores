package conexiones;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Files.Persona;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String nombre;
		int edad;
		try {
		Connection miCon=Conexion.conectar("acceso");
		PreparedStatement stmt= miCon.prepareStatement("select * from personas where nombre like 'merche'");
		ResultSet results = stmt.executeQuery();
		while(results.next()) {
//			System.out.println("Nombre: "+results.getString("nombre"));
//			System.out.println("Edad: "+results.getString("edad"));
			nombre = results.getString("nombre");
			edad = results.getInt("edad");
			Persona p = new Persona(nombre, edad);
			personas.add(p);
		}
		}catch (SQLException e){
			System.out.println("Excepción "+e);
		}
		for (Persona pAux : personas) {
			System.out.println(pAux.toString());
		}
	}

}
