
public class Feet {

	private int feet;
	private int inches;
	
	public Feet(int feet,int inches) {
		
		this.feet= feet;
		this.inches = inches;
	}
	
	
	public Feet(Feet len) {
		
		this.feet = len.feet;
		this.inches = len.inches;
		
	}
	
	public void add(Feet f1,Feet f2) {
		
		int totFeet = (f1.feet + f2.feet);
		int totInch = (f1.inches + f2.inches);
		int restFeet = totInch%2;
		int restinch = totInch - (restFeet * 12);
		int finalFeet = totFeet+restFeet;
		
		this.feet=finalFeet;
		this.inches =restinch;
	}
	
	public void print() {
		
		System.out.println(this.feet+"'"+this.inches+"\"" );
	
	}
	
	public void print(String msg) {
		
		System.out.println(msg+":"+this.feet+"'"+this.inches+"\"");
		
	}
	
	public void add(Feet f1) {
		
		int tfeet = f1.feet + this.feet;
		int totinch = f1.inches+this.inches;
		int restFeet = totinch%2;
		int restinch = totinch - (restFeet * 12);
		int finalFeet = tfeet+restFeet;
		
		this.feet = finalFeet;
		this.inches = restinch;
		
		
	}
	
	public static void print(Feet f) {
		
		System.out.println(f.feet+"'"+f.inches+"\"");
		
	}
	
}
