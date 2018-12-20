package list;

public class Main {

	public static void main(String[] args) {
		
		List llista = new List();
		
		Node afegir  = new Node (1);
		Node afegir2 = new Node (2);
		Node afegir3 = new Node (3);
		Node afegir4 = new Node (4);
		Node afegir5 = new Node (8);
		
		
		llista.afegirPrincipi(afegir);
		llista.afegirPrincipi(afegir2);
		llista.afegirPrincipi(afegir3);
		llista.afegirFinal(afegir4);
		llista.afegirPosicio(afegir5, 3);
		
		System.out.println(llista.principi.id);
		System.out.println(llista.principi.next.id);
		System.out.println(llista.principi.next.next.id);
		System.out.println(llista.principi.next.next.next.id);
		System.out.println(llista.ultim.id);
		
		

	}

}
