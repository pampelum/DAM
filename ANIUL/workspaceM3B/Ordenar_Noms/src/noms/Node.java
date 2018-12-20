package noms;

public class Node {
	Node next = null;
	String nom;
	String cognom;
	int numero;
	
	Node()
	{
		
	}
	
	Node(String s)
	{
		this.nom = s;
	}
	
	Node(String s, int n, String c)
	{
		nom = s;
		numero = n;
		cognom = c;
	}
}
