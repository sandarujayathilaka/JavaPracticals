
public class PartTimeStudent extends Student {
	
	private int noworkhour;

	public PartTimeStudent(String name, String ditno, String address, String StudentId,int noworkhour) {
		super(name, ditno, address, StudentId);
		
		this.noworkhour = noworkhour;
	}

public void showDetails() {
		
		super.showDetails();
		System.out.println("Hour:"+this.noworkhour);
		
		
	}

}
