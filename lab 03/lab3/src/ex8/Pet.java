package ex8;

public class Pet {

	private String name;
	private String owner;
	private int age;
	
	public Pet() {
	
		System.out.println("default super");
	}
	
	public Pet(String n, String o, int a) {
		
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	
	public Pet(String n, String o) {
		
		this.name =n;
		this.owner=o;
		this.age=0;
	}

	
	public void showDetails(){
		
		System.out.print("I am a pet. My name is "+this.name+". My owner is "+this.owner);
	
	}
	
}
