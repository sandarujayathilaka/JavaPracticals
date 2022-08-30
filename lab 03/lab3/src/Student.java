
public class Student extends Person {


	protected String ditno;
	protected String studentId;

	
	Student (String name,String ditno,String address,String StudentId){
		
		super(name,address);
		this.ditno = ditno;
		this.studentId =StudentId;
		
	}
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Student ID :"+ this.studentId);
		
		
	}
	
	public void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Ditno :"+this.ditno);
		System.out.println("address :"+this.address+"\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDit() {
		return ditno;
	}

	public void setDit(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		
		String s = "I am a Student\nMy name is "+this.getName()+"\nI am from "+this.getAddress()+"\nMy dit no is "+this.getDit();
		return s;
	}
	
	
}
