import java.util.*;
public class ex3{
	
	public static void main(String args[]){
		
		Scanner ob1 = new Scanner(System.in);
		
		System.out.print("Enter the age :");
		int age = ob1.nextInt();
		
		if(age>18){
			
			System.out.print("Adult");
			
		}
		
		else{
			
			System.out.print("Child");
			
		}
		
		
		
	}
	
	
	
}