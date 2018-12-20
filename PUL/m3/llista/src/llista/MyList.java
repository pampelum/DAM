package llista;

public class MyList {
	private Node first;
	private Node last;
	private int mida;
	
	
	public Node getFirst() {
		return first;
	}
	
	public void setFirst(Node first) {
		this.first = first;
	}
	
	public Node getLast() {
		return last;
	}
	
	public void setLast(Node last) {
		this.last = last;
	}
	
	public int getMida() {
		return mida;
	}
	
	public void setMida(int mida) {
		this.mida = mida;
	}
	
	
	//Sistema
	
	/* esBuit: comprova si la llista es buida
	 * 
	 * Pre:
	 * Post: 
	 * Err: 
	 */
	public boolean esBuit() {
		
		if(this.first == null) {
			return true;
			
		}
		
		return false;
		
	}
	
	/* trobarNodeEnPosicio: retorna el node en la posicio N
	 * 
	 * Pre: a la llista hi ha nodes al menys fins a la posicio N
	 * Post: 
	 * Err: no hi existeix la posicio N a la llista
	 */
	public Node trobarNodeEnPosicio(int pos) {
		
		if(pos>0 && pos <= mida) {
			Node punterNode = this.getFirst();
			
			for(int i = 1; i<pos; i++) {
				punterNode = punterNode.getNext();
			}
			
			return punterNode;
			
		}else {
			System.err.println("Error: la posicio no existeix");
			return null;
		}
		
	}
	
	
	//Afegir
	
	/* afegirPrincipi: afegeix un node a la primera posicio
	 * 
	 * Pre: 
	 * Post: la llista conte els nodes que contenia i el node afegit al principi
	 * Err: 
	 */
	public void afegirPrincipi(Node node) {
		
		if(mida > 0) {
			node.setNext(this.getFirst().getNext());
		}
		
		this.setFirst(node);
		
		if(mida == 0) {
			this.setLast(node);
			
		}
		
		this.mida++;
		
	}
	
	/* afegirFinal: afegeix un node al final de la llista
	 * 
	 * Pre: a la llista hi ha minim un node
	 * Post: la llista conte els nodes anteriors i el node afegit al final
	 * Err: 
	 */
	public void afegirFinal(Node node) {
		
		if(mida > 0) {
			this.getLast().setNext(node);
			this.setLast(node);
			this.mida++;
			
		}
		
	}
	
	/* trobarNodeEnPosicio: afegeix un node despres del node que es trobi en la posicio N
	 * 
	 * Pre: a la llista hi ha nodes al menys fins a la posicio N
	 * Post: la llista conte els nodes anteriors amb el node afegit a la posicio N+1
	 * Err: no hi existeix la posicio N a la llista
	 */
	public void afegirDespresPosicio(Node nodeAfegir,int pos) {
		
		if(mida > 0 && pos >=0 && pos<=mida) {
			
			if(pos == 0) {
				afegirPrincipi(nodeAfegir);
				
			}else if(pos == mida) {
				afegirFinal(nodeAfegir);
				
			}else {
				Node nodePos = trobarNodeEnPosicio(pos);
				nodeAfegir.setNext(nodePos.getNext());
				nodePos.setNext(nodeAfegir);
				this.mida++;
				
			}
			
		}else {
			System.err.println("Error: la posicio a afegir no existeix");
		}
	
	}
	

	public void afegirOrdenatPerNom(Node nodeAfegir) {
		int pos=0;
		String[] nomComplert = nodeAfegir.getName().split("\\s+");
		String[] nomComplertComparar;
		Node aComparar;

		while(pos>=0) {
			aComparar = trobarNodeEnPosicio(pos);
			nomComplertComparar = aComparar.getName().split("\\s+");
			
			if(nomComplert[0].compareToIgnoreCase(nomComplertComparar[0]) > 0) {	//Nom major al comparat
				pos++;
				
			}else if(nomComplert[0].compareToIgnoreCase(nomComplertComparar[0]) == 0) {	//Noms iguals (Pasar a comparar cognoms)
				
				if(nomComplert[1].compareToIgnoreCase(nomComplertComparar[1]) > 0) {	//Cognom major al comparat
					pos++;
					
				}else {	//Cognom menor o igual al comparat
					afegirDespresPosicio(nodeAfegir, pos-1);
					pos = -1;
					
				}
				
			}else {	//Nom menor al comparat
				afegirDespresPosicio(nodeAfegir, pos-1);
				pos = -1;
				
			}
		}
	}

	
	//Eliminar
	
	/* eliminarPrincipi: elimina el primer node
	 * 
	 * Pre: a la llista hi ha al menys un node
	 * Post: la llista conte els nodes que contenia menys el primer
	 * Err: no hi ha cap node a la llista
	 */
	public void eliminarPrincipi() {
		
		if(mida > 0) {
			Node nodeEliminar = this.getFirst();
			this.setFirst(first.getNext());
			nodeEliminar=null;
			this.mida--;
			
		}else {
			System.err.println("Error: la llista ja esta buida");
			
		}
		
	}
	
	/* eliminarFinal: elimina l'ultim node de la llista
	 * 
	 * Pre: a la llista hi ha al menys un node
	 * Post: la llista conte els nodes que contenia menys l'ultim
	 * Err: la llista no conte cap node
	 */
	public void eliminarFinal() {
		
		if(mida > 0) {
			Node nodeEliminar = this.getLast();
			this.setLast(trobarNodeEnPosicio(mida-1));
			nodeEliminar=null;
			this.mida--;
			
		}else {
			System.err.println("Error: la llista ja esta buida");
			
		}
		
	}

	/* eliminarDespresDePosicio: elimina el node despres de la posicio N
	 * 
	 * Pre: a la llista hi ha nodes al menys fins a la posicio N+1
	 * Post: la llista conte els nodes que contenia menys el node en posicio N+1
	 * Err: no hi existeix la posicio N+1 a la llista
	 */
	public void eliminarDespresDePosicio(int pos) {
		
		if(mida > 0 && pos >=0) {
			
			if(mida >= pos) {
				
				if(pos == 0) {
					eliminarPrincipi();
					
				}else if(pos == mida-1) {
					eliminarFinal();
					
				}else {
					Node nodeEliminar = trobarNodeEnPosicio(pos+1);
					trobarNodeEnPosicio(pos).setNext(trobarNodeEnPosicio(pos+2));
					nodeEliminar=null;
					
				}
				
			}else {
				System.err.println("Error: la posicio a eliminar no existeix");
				
			}
			
		}else {
			System.err.println("Error: la llista ja esta buida");
			
		}
		
	}
	
}
