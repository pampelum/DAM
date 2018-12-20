package llista;

public class Main {

	public static void main(String[] args) {
		Llista llista = new Llista();
		
		llista.afegirInici(new Node("test"));
		llista.afegirInici(new Node("test2"));
		llista.afegirFinal(new Node("test3"));
		llista.afegirFinal(new Node("test4"));
		//llista.afegirPosicioAbans(new Node("test5"), 45);
		//llista.afegirPosicioDespres(new Node("test6"), 1);
		llista.borrarPosicio(2);
		
//		System.out.println(llista.first.name);
//		System.out.println(llista.last.name);
		
		llista.mostrarNodes();
		//llista.contarNodes();
		
		//System.out.println(llista.llistaBuida());
	}

}
