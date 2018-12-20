package ac2;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
	String extencio;
	Filtre(String e)
	{
		this.extencio = e;
	}
	
	@Override
	public boolean accept(File ruta, String nom) {
		// TODO Auto-generated method stub
		return nom.endsWith(extencio);
	}
}
