package num_1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class Connection {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String usuari,password;
		Connection con1;
		
		java.sql.Connection conn = DriverManager.getConnection("jdbc:postgresql://" + "localhost" + ":" + "5432" + "/Fruites" + "?preferQueryMode=" + null, "postgres", "aniol");
		
		
		
//		System.out.print("Entra la base de dades: ");
//		url = "jdbc:postgresql:" + sc.next();
//		
//		System.out.println(url);
//		
//		System.out.print("Entra el nom d'usuari: ");
//		usuari = sc.next();
		
		
	}

}
