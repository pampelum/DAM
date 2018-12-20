package Classes_Genèriques;

public class Object1 {

   public static void main(String args[]){
		GenericsTypeOld<Number> type = new GenericsTypeOld();
		type.set(new Double(3)); 
		double str = (double) type.get(); //type casting, error prone and can cause ClassCastException
		
		System.out.println(str);
		System.out.println(type.compareTo(4));
	}
}
