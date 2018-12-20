package application;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String year;
	private String genere;
	private String language;
	private String publisher;
	
	Book(){
		
	}

	Book(String isbn, String title, String author, String year, String genere, String language, String publisher){
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setAuthor(author);
		this.setYear(year);
		this.setGenere(genere);
		this.setLanguage(language);
		this.setPublisher(publisher);
	}
	
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String toString() {
		String returnString;
		
		returnString ="[" + isbn + " " + title + " " + author + " " + year + " " + genere + " " + language + " " + publisher + "]";
		
		return returnString;
	}
}
