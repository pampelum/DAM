package application;

public class Llibre {
	String nom, autor, editorial, data;
	String isbn, edicio;
	
	Llibre(String n, String a,String edito ,String data, String isbn, String edicio)
	{
		this.nom = n;
		this.autor = a;
		this.editorial = edito;
		this.data = data;
		this.isbn = isbn;
		this.edicio = edicio;
	}
	
	public void mostrar()
	{
		System.out.println("Nom: " + this.nom);
		System.out.println("Autor: " + this.autor);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Data Sortida: " + this.data);
		System.out.println("Editorial: " + this.editorial);
		System.out.println("Numero Edicio: " + this.edicio);
	}
}
