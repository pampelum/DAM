import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class connection {
	public static void main(String[] args) throws SQLException {
		int opcio;
		Scanner sc = new Scanner(System.in);
		
		//iniciar la coneccio
		Connection conn = DriverManager.getConnection("jdbc:postgresql://" + "localhost" + ":" + "5432" + "/M6" + "?preferQueryMode=" + null, "postgres", "aniol");
		
		//bucle menu
		do
		{
			System.out.println("1) Afegir: \n2) Esborrar: \n3) Editar: \n4) Mostrar: \n5) Sortir: ");
			System.out.print("Selecciona la opcio: ");
			opcio = sc.nextInt();
			
			switch (opcio) {
			case 1://opcio 1 del menu
				afegir(conn, sc);
				break;
				
			case 2://opcio 2 del menu
				borrar(conn, sc);
				break;
			
			case 3://opcio 3 del menu
				editar(conn,sc);
				break;
			case 4://opcio 4 del menu
				mostrar(conn,sc);
				break;
			default:
				opcio = 0;
			}
			
			
		}while(opcio != 0);
		
	}
	
	//afegir un nou contacte a lagenda
	public static void afegir(Connection conn, Scanner sc) throws SQLException
	{
		Statement statement = conn.createStatement();

		String dni, nom, dataNaix, adreca;
		int tel;
		
		//demanar les dades de la persona
		System.out.println("Entra el DNI: ");
		dni = sc.next();
		System.out.println("Entra el Nom: ");
		sc.nextLine();//consumir una linia si no no funciona
		nom = sc.nextLine();
		System.out.println("Entra la data de Naixament: ");
		dataNaix = sc.next();
		System.out.println("Entra la Adreca: ");
		sc.nextLine();//consumir una linia si no no funciona
		adreca = sc.nextLine();
		System.out.println("Entra el Numero de Telefon: ");
		tel = sc.nextInt();
		
		//executar la sentencia SQL per afegir la nova persona
		statement.execute("INSERT INTO taula1 VALUES ('" + dni + "','" + nom + "','" + dataNaix + "','" + adreca + "','" + tel + "');");
	}

	//borrar un contacte per el DNI
	public static void borrar(Connection conn, Scanner sc) throws SQLException
	{
		Statement statement = conn.createStatement();
		String dni;
		
		System.out.println("Entra el DNI de la Persona a Borrar: ");
		sc.nextLine();
		dni = sc.nextLine();
		
		statement.execute("DELETE FROM taula1 WHERE dni LIKE '" + dni + "';");
	}
	
	//editar un contacte per el DNI
	public static void editar(Connection conn, Scanner sc) throws SQLException
	{
		Statement statement = conn.createStatement();
		String editar,dni,nom,dataNaix,adreca, dni_editar;
		String[] noms_camps = {"dni","nom","datanaix","adreca","telefon"};
		String[] valors = new String[5];
		Boolean[] editats = new Boolean[5];
		int tel;
		
		//inicialitzar l'array amb false
		for(int i = 0; i < editats.length; i++)
		{
			editats[i] = false;
		}
		
		//preguntar el DNI dle contacte a modificar
		System.out.println("Entra el DNI del contacte a editar: ");
		dni_editar = sc.next();
		//exlicacio
		System.out.println("Respon amb si i no");
		
		//preguntar si es vol canviar el dni
		System.out.println("Vols Canviar el DNI?");
		editar = sc.next();
		
		//comporvar si es vol editar
		if(editar.compareTo("si") == 0)
		{
			//demanar el nou DNI i guardarlo i posar que sha editat
			System.out.println("Entra el nou DNI: ");
			sc.nextLine();//consumir una linia
			valors[0] = sc.nextLine();
			editats[0] = true;
		}
		
		//preguntar si es vol canviar el nom
		System.out.println("Vols Canviar el Nom?");
		editar = sc.next();
		
		//comporvar si es vol editar
		if(editar.compareTo("si") == 0)
		{
			//demanar el nou nom i guardarlo i posar que sha editat
			System.out.println("Entra el nou Nom: ");
			sc.nextLine();
			valors[1] = sc.nextLine();
			editats[1] = true;
		}
		
		//preguntar si es vol editar la data de naixament
		System.out.println("Vols Canviar el Data de Naixament?");
		editar = sc.next();
		
		//comporvar si es vol editar
		if(editar.compareTo("si") == 0)
		{
			//demanar la nova data de naixament i guardarlo i posar que sha editat
			System.out.println("Entra la nova Data de Naixament: ");
			sc.nextLine();
			valors[2] = sc.nextLine();
			editats[2] = true;
		}
		
		//preguntar si es vol editar la adreca
		System.out.println("Vols Canviar la Adreca?");
		editar = sc.next();
		
		//comporvar si es vol editar
		if(editar.compareTo("si") == 0)
		{
			//demanar la nova adreca i guardarlo i posar que sha editat
			System.out.println("Entra la nova Data de Adreca: ");
			sc.nextLine();
			valors[3] = sc.nextLine();
			editats[3] = true;
		}
		
		//preguntar si es vol editar el telefon
		System.out.println("Vols Canviar el Telefon?");
		editar = sc.next();
		
		//comporvar si es vol editar
		if(editar.compareTo("si") == 0)
		{
			//demanar el nou telefon i guardarlo i posar que sha editat
			System.out.println("Entra el nou Telefon: ");
			sc.nextLine();
			valors[4] = sc.nextLine();
			editats[4] = true;
		}
		
		//recore tot larray de les modificacions
		for(int i = 0; i < editats.length; i++)
		{
			//mirar si esta editat
			if(editats[i])
			{
				//comprovar espesificament si el DNI sha canviat
				if(editats[i] == true)
				{
					//si estem en la primera iteracio del bucle(canviar dni) tot normal
					if(i == 0)
					{
						statement.execute("UPDATE taula1 SET " + noms_camps[i] + "='" + valors[i] + "' WHERE dni='" + dni_editar + "';");
					}
					else//si no posar que el dni de la persona es el que hem entrar
					{
						if(i != 4)//comprovar si no estem a la iteracio 4(canviar el numero de telefon)
						{
							statement.execute("UPDATE taula1 SET " + noms_camps[i] + "='" + valors[i] + "' WHERE dni='" + dni_editar + "';");
						}
						else//si hi som fer un parse int al valor que entrem per el numero de telefon
						{
							statement.execute("UPDATE taula1 SET " + noms_camps[i] + "='" + Integer.parseInt(valors[i]) + "' WHERE dni='" + dni_editar + "';");
						}
					}
				}
				else//si el DNI no sha canviat tot normal
				{
					if(i != 4)//comprovar si no estem a la iteracio 4(canviar el numero de telefon)
					{
						statement.execute("UPDATE taula1 SET " + noms_camps[i] + "='" + valors[i] + "' WHERE dni='" + dni_editar + "';");
					}
					else//si hi som fer un parse int al valor que entrem per el numero de telefon
					{
						statement.execute("UPDATE taula1 SET " + noms_camps[i] + "='" + Integer.parseInt(valors[i]) + "' WHERE dni='" + dni_editar + "';");
					}
				}
			}
		}
		
	}

	//mostrar els contactes de la taula
	public static void mostrar(Connection conn, Scanner sc) throws SQLException
	{
		Statement statement = conn.createStatement();
		//fer el select
		ResultSet resultSet = statement.executeQuery("SELECT * FROM taula1");
		
		//mostrar el resultat
		while (resultSet.next()) 
		{
			System.out.printf("%-30.30s  %-30.30s  %-30.30s  %-30.30s  %-30.30s%n", resultSet.getString("dni"), resultSet.getString("nom"),resultSet.getString("datanaix"),resultSet.getString("adreca"),resultSet.getString("telefon"));
		}

	}
}
