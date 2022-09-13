package practice;

public class employee implements printable {

	private int empId;
	private String empName;
	private String department;
	
	public employee(int empId, String emp, String department) {
		
		this.empId = empId;
		this.empName = emp;
		this.department = department;
	}
	
	public void print() {
		System.out.println("Emp ID : "+empId+"\nempName :"+empName+"\ndepartment :"+department);
	}
	
	
	
}
