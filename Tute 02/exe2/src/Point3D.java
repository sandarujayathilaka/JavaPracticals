import java.lang.Math;

public class Point3D {
	
	private double x;
	private double y;
	private double z;
	
	public Point3D(double x,double y,double z) {
		
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
	public void distance() {
		
		System.out.println(Math.sqrt(Math.pow(x,2) + Math.pow(y, 2)+Math.pow(z, 2)));
		
		
	}

}
