package lab4;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] student = new Student [5];
		
		student[0]= new Student("Sahan","IT","0112482485");
		student[1] = new Student("Shan","ICS","0774333456");
		student[2] = new Student("Falon","SE","0714333450");
		student[3] = new Student("Nimal","DS","0785695863");
		student[4] = new Student("Kaween","IM","0724102245");
		
		for(int i=0;i<5;i++) {
			
			student[i].print();
		}
		

	}

}
