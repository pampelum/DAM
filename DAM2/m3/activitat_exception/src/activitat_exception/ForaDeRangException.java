package activitat_exception;

public class ForaDeRangException extends Exception{

	ForaDeRangException(double nombre){
		System.err.println(nombre+" esta fora de rang");
	}
}
