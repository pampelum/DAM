package file;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {

	String extensio;
	Filtre(String extension){
		this.extensio = extension;
	}
	
	
	public boolean accept(File ruta, String nom) {
		return nom.endsWith(extensio);
	}

}
