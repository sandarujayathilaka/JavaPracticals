
	public class cal {

		private double avgMark;
		private double mark1;
		private double mark2;
		private double mark3;
		private String name;
		private String Id;
 
 
 
		public cal() {
	 
			mark1 =0;
			mark2 =0;
			mark3=0;
	 
	 
		}
 
		public void calAvg() {
	
			this.avgMark = (mark1+mark2+mark3)/3.0;
	 
			
		}
 
		public void display() {
	 
			System.out.println("Name : "+this.name);
			System.out.println("ID num : "+this.Id);
			System.out.println("Average : "+this.avgMark);
	 
		}

 

		public void setMark1(double mark1) {
			this.mark1 = mark1;
		}

		public void setMark2(double mark2) {
			this.mark2 = mark2;
		}

		public void setMark3(double mark3) {
			this.mark3 = mark3;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setId(String id) {
			Id = id;
		}
 
 
	
	
}
