package llista;

public class Main {

	public static void main(String[] args) {
		MyList llista = new MyList();
		
		Node node1 = new Node("primer");
		Node node2 = new Node("segon");
		Node node3 = new Node("tercer");
		Node node4 = new Node("quart");
		Node node5 = new Node("cinque");
		
		llista.afegirPrincipi(node1);
		llista.afegirFinal(node2);
		llista.afegirFinal(node3);
		llista.afegirFinal(node4);

		System.out.println("Mida: "+llista.getMida());
		System.out.println(llista.trobarNodeEnPosicio(1).getName());
//		System.out.println(llista.trobarNodeEnPosicio(0).getName());
		System.out.println(llista.trobarNodeEnPosicio(4).getName());
		System.out.println();
		
		llista.eliminarPrincipi();
		System.out.println("Mida: "+llista.getMida());
		System.out.println(llista.trobarNodeEnPosicio(1).getName());
		System.out.println(llista.trobarNodeEnPosicio(3).getName());
		System.out.println();
		
		llista.afegirDespresPosicio(node5, 2);
		System.out.println("Mida: "+llista.getMida());
		System.out.println(llista.trobarNodeEnPosicio(1).getName());
		System.out.println(llista.trobarNodeEnPosicio(2).getName());
		System.out.println(llista.trobarNodeEnPosicio(3).getName());
		System.out.println(llista.trobarNodeEnPosicio(4).getName());
		System.out.println();
		
		llista.eliminarDespresDePosicio(2);
		System.out.println("Mida: "+llista.getMida());
		System.out.println(llista.trobarNodeEnPosicio(1).getName());
		System.out.println(llista.trobarNodeEnPosicio(2).getName());
		System.out.println(llista.trobarNodeEnPosicio(3).getName());
		System.out.println();
	}

}
