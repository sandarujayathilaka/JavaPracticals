
public class computing extends student {

	private String comId;
	
	static{
		
		dean ="Dr.Chathura";
		
		}
	
	public computing() {
		
		this("kamal","101",0777123456,3.85,"IT001");
		System.out.println("child constructor default");
	}
	
	public computing(String name, String ID, long tel, double gpa,String comId) {
		
		super(name,ID,tel,gpa);
		
		this.name = name;
		this.ID = ID;
		this.tel = tel;
		this.gpa =gpa;
		this.comId = comId;
		
	
		System.out.println("Execute the parameterized constructor\n");
		
	}
	
	
	
	
}