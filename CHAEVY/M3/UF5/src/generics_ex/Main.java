package generics_ex;

public class Main {

	public static void main(String[] args) {
		Genereic<Integer> type = new Genereic<>();
		type.set((3)); 
		//Number str = type.get(); //type casting, error prone and can cause ClassCastException
		System.out.println(type.compareTo(4));
	

	}

}
