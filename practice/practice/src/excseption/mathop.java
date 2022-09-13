package excseption;

public class mathop {
	
	private int c;
	private int d;

	public mathop(int a , int b) {
		
		c = a;
		d = b;
		
	}

	public int getdevide() throws ArithmeticException {
		return c;
	}

	public int getadd() {
		return c+d;
	}

	
	
}
