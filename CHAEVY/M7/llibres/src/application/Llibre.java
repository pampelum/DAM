package application;

public class Llibre {

	private String titol;
	private String autor;
	private String isbn;
	private String genere;
	private String anypub;
	private String edicio;
	private String editora;
	private String idioma;	
	
	Llibre(){
		
	}
	
	Llibre(String titol, String autor, String isbn, String genere, String anypub,
			String edicio, String editora, String idioma){
		this.setTitol(titol);
		this.setAutor(autor);
		this.setIsbn(isbn);
		this.setGenere(genere);
		this.setAnypub(anypub);
		this.setEdicio(edicio);
		this.setEditora(editora);
		this.setIdioma(idioma);
	}
	
	public String getTitol() {
		return titol;
	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAnypub() {
		return anypub;
	}
	public void setAnypub(String anypub) {
		this.anypub = anypub;
	}
	public String getEdicio() {
		return edicio;
	}
	public void setEdicio(String edicio) {
		this.edicio = edicio;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}


