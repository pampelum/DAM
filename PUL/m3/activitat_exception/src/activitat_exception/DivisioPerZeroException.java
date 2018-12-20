package activitat_exception;

public class DivisioPerZeroException extends Exception{

	DivisioPerZeroException(){
		System.err.println("Divisio per zero!");
	}
}
