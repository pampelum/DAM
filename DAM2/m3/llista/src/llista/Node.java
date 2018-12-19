package llista;

public class Node {
	
	private String name;
	private Node next;
	
	Node(String name){
		this.setName(name);
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
