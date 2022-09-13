package practice;

public class MyMain {
	
public static void main(String args[]) {
	
	employee em1 = new employee(001,"Sandaru","FOC");
	Book b1 =  new Book(1256,"Harry","Roland");
	
	em1.print();
	b1.print();
	
	double num = 0/0.0;
	
	System.out.println(num);
	
}
}
