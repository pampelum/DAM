package conctarBBDD;
import java.sql.*;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("org.postgresql.Driver");
		
		Connection conexio = null;
		conexio = DriverManager.getConnection(
				"jdbc:postgresql://" + "localhost" + ":" + "5432" +"/terrenys"+ "?preferQueryMode="+"null","postgres","dam"
				);
		Statement n;
		//record set
		//bucel mentre recordset tingu registre fer sout de recorser .nom
		

	}

}
