
public class student {

	protected String name;
	protected String ID;
	protected long tel;
	protected double gpa;
	protected static String dean;
	protected final double semFee;
	
	public student(double semFee) {
		
		this.semFee = semFee;
		
	}
	
	public student() {
	 
		this.semFee = 195000.00;
		System.out.println("Execute the base class default constructor");
		
		
	}
	

	public student(String name, String ID, long tel, double gpa) {
		
		this();
		this.name = name;
		this.ID = ID;
		this.tel = tel;
		this.gpa = gpa;
	
		
		System.out.println("execute the base class parameterized constructor");
	}

	public void display() {
		
		System.out.println("Your GPA is : "+this.name);
		System.out.println("Your GPA is : "+this.ID);
		System.out.println("Your GPA is : "+this.tel);
		System.out.println("Your GPA is : "+this.gpa);
		
	}

	
	public void displayTot(double [] array) {
		
		double sum = 0;
		
		for(int i=0; i<5;i++) {
			
			sum = sum + array[i];
			
		}
		
		System.out.println("The total is : "+sum);
		
		
	}
	
	public static void details() {
		
		System.out.println("The dean is : "+dean);
		
		student s1 = new student();
		
		s1.call();
		
		count();		
		
	}
	
	public static void count() {
		
		System.out.println("call the static method from static method");
		
		
	}
	
	public void call() {
		
		System.out.println("Call the non-static method from static method");
		
		
	}
	
	
	
	
	}

