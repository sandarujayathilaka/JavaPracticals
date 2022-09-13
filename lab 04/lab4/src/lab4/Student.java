package lab4;

public class Student {
	
	private int studentId;
	private String name;
	private String degree;
	private String mobile;
	
	private static int max =100;
	
	public Student(String name, String degree, String mobile) {
		
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		
		
	}

	public String getName() {
		return name;
	}

	public String getDegree() {
		return degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		
		System.out.println("Name : "+getName());
		System.out.println("Degree : "+getDegree());
		System.out.println("Mobile : "+getMobile());
		System.out.println("SID : "+getNextStudentID());
	}
	
	public static int getNextStudentID() {
		
		 return max++;
		
	}
	

}
