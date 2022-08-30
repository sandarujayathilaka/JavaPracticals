import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cal ob = new cal();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		ob.setName(scn.next());
		
		System.out.println("Enter Your ID : ");
		ob.setId(scn.next());
		
		System.out.println("Enter Your Mark 1 : ");
		ob.setMark1(scn.nextDouble());
		
		System.out.println("Enter Your Mark 2 : ");
		ob.setMark2(scn.nextDouble());
		
		System.out.println("Enter Your Mark 3 : ");
		ob.setMark3(scn.nextDouble());
		
		ob.calAvg();
		ob.display();



	}

}
