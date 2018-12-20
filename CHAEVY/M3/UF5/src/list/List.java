package list;

public class List {

	 public Node principi = null;
	 Node ultim = null;
	
	
	public void afegirPrincipi(Node afegir) {
		
		if(principi == null) {
			afegir.next = principi;
			principi = afegir;
			ultim = afegir;
		}
		else {
			afegir.next = principi;
			principi = afegir;
			
		}
	}
	
	public void afegirFinal(Node afegir) {
		
		ultim.next = afegir;
		ultim = afegir;
		
	}
	
	public void afegirPosicio(Node afegir, int posicio) {
		
		int i = 1;
		Node temporal = null;
		Node nodeTemporal = null;
		temporal = principi;
		
		
		//Trobar posicio
		do {
			nodeTemporal = temporal.next;
			temporal = nodeTemporal;
			i++;
		}while(i < posicio-1);
		
		afegir.next = temporal.next;
		temporal.next = afegir;
		

		
	}
	
	public void borrarPosicio(Node borrar, int posicio) {
		
		int i = 1;
		Node temporal = null;
		Node nodeTemporal = null;
		temporal = principi;
		
		do{
			nodeTemporal = temporal.next;
			temporal = nodeTemporal;
			i++;
		}while(i < posicio-1);
		
		
	}	
}


	
