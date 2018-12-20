package prova_generic;

public class Main {

	public static void main(String args[]){
		GenericsTypeOld<Integer> type = new GenericsTypeOld<>();
		type.set(new Integer(4)); 
		System.out.println(type.compareTo(4));
	}
	
}
