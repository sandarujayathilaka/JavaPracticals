package practice;

public class Book implements printable {
	
	private int ISBN;
	private String name;
	private String author;
	
	public Book(int iSBN, String name, String author) {
		
		this.ISBN = iSBN;
		this.name = name;
		this.author = author;
	}
	
	public void print() {
		System.out.println("ISBN : "+ISBN+"\nName :"+name+"\nAuthor :"+author);
	}
	

}
