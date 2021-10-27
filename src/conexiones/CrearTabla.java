package conexiones;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bd="acceso";
		Connection miCon = Conexion.conectar(bd); //esto nos conecta a la base de datos acceso
		//ponemos aquí la consulta y así luego el código lo podemos reutilizar mejor
		String consulta="CREATE TABLE CLIENTES (DNI CHAR(9) NOT NULL, APELLIDOS VARCHAR(32) NOT NULL, "
				+ "CP CHAR(5), PRIMARY KEY (DNI))";
		try {
			Statement s= miCon.createStatement();
//			boolean consultaOK = s.execute(consulta);
//			if (consultaOK) {
//				System.out.println("Consulta ejecutada con éxito.");
//			}
			DatabaseMetaData dbmd = miCon.getMetaData();
			String driverVersion = dbmd.getDriverVersion();
			System.out.println(driverVersion);
			String[] tipos = {"TABLE", "VIEW"};
			ResultSet tablas = dbmd.getTables(null, null, null, tipos);
			while (tablas.next()) {
				String catalogo = tablas.getString("TABLE_CAT");
				String esquema = tablas.getString("TABLE_SCHEM");
				String nombre = tablas.getString("TABLE_NAME");
				String tipo = tablas.getString("TABLE_TYPE");
				System.out.println("nombre: "+nombre);
			}
		} catch (SQLException e) {
			System.out.println("Error "+e);
		}
		
	}

}
