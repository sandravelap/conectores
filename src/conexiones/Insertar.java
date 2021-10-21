package conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Files.Leer;
import Files.Persona;

public class Insertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		try {
			Connection miCon=Conexion.conectar();
			nombre = Leer.pedirCadena("Introduce un nombre para la persona: ");
			edad = Leer.pedirEntero("Introduce una edad: ");
			Persona p = new Persona(nombre, edad);
			PreparedStatement insertar= miCon.prepareStatement("INSERT INTO `personas` (`nombre`, `edad`) VALUES (?, ?) ");
			insertar.setString(1, nombre);
			insertar.setInt(2, edad);
			insertar.executeUpdate();
			edad++;
			p = new Persona(nombre, edad);
			int i=1;
			insertar.setString(i++, p.getNombre());
			insertar.setInt(i++, p.getEdad());
			insertar.executeUpdate();

			}catch (SQLException e){
				System.out.println("Excepción "+e);
			}
	}

}
