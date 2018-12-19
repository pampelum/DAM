package agenda;

public class Agenda {
	private MyList llistat[] = new MyList[26]; 
	
	Agenda() {
		for(int i = 0; i < llistat.length; i++) {	//inicialitzar llistes
			llistat[i] = new MyList();
		}
	}
	
	public void afegirPersona(String nom) {	//crear un node i afegirlo
		afegirNom(new Node(nom));
	}
	
	public void afegirNom(Node nom) {	//afegir un node existent
		char inicial;
		inicial = nom.getName().toLowerCase().charAt(0);
		
		llistat[inicial-(int)'a'].afegirOrdenatPerNom(nom);
		
	}
	
	public boolean buscarPerNom(String nomBuscar) {	//comprovar si el nom existeix
		char inicial = nomBuscar.toLowerCase().charAt(0);
		
		if(llistat[(int)inicial-(int)'a'].buscarPerNom(nomBuscar) != null) {	//retorna un nom
			return true;
		}else {		//no retorna nom
			return false;
		}
	}
	
	public void eliminarNom(String nomEliminar) {	//eliminar node amb el nom introduit
		char inicial = nomEliminar.toLowerCase().charAt(0);
		
		if(buscarPerNom(nomEliminar)) {
			llistat[(int)inicial-(int)'a'].eliminarPerNom(nomEliminar);
		}else {
			System.err.println("El nom " + nomEliminar + " no existeix");
		}
		
	}
	
	public void mostrarAgenda() {	//imprimeix l'agenda per pantalla
		
		System.out.println("AGENDA");
		System.out.println("-------------------------------");
		for(int i = 0; i < llistat.length; i++) {
			System.out.print((char)((char)i-32+(int)'a')+": ");	//imprimir les inicials
			
			for(int x = 1; x < llistat[i].getMida()+1; x++) {
				
				if(llistat[i].getLast() == llistat[i].trobarNodeEnPosicio(x)) {	//l'ultim element no imprimeix una coma
					System.out.print(llistat[i].trobarNodeEnPosicio(x).getName()+"  ");
					
				}else {
					System.out.print(llistat[i].trobarNodeEnPosicio(x).getName()+",  ");
					
				}
			}
			System.out.println("");
		}
		System.out.println("-------------------------------");
	}
}
