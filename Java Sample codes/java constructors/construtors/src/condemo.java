
/**
 * @author Sandaru Jayathilaka
 * 
 *Example of this and constructors
 *
 */
public class condemo {
	
	private String name;
	private double mark;
	private int id;
	
	public condemo() {
		this.name = null;
		this.mark = 0.0;
		this.id = 0;
	}
	
	public condemo(String name,double mark,int id) {
		
		this.name=name;
		this.mark=mark;
		this.id=id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void add(double x,int y) {
		
		System.out.println("The total is :"+ (x+y));
		
	}
	
	public void total() {
		
		this.add(this.mark,100);
	}
	

}
