import java.util.*;

public class pattern2 {
	
	public static void main(String args[]) {
		
		Scanner ob1 = new Scanner(System.in);
		int i;
		int j =0;
		int k =0;
		
		for(i=1;i<=10;i++) {
			
			System.out.println("Enter the num "+ i +" : ");
			int num1= ob1.nextInt();
			
			if(num1 % 2.0==0){
				j++;
			}
			
			else {
				k++;
			}
			
		}
		
		
		System.out.println("Even num count = "+j);
		System.out.println("odd num count = "+k);
		
		}
		
	}


