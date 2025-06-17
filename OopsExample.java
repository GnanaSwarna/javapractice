package xyz;
class Exam{
     
		private String name;
		private  int rollnumber;
		private  int marks;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollnumber() {
			return rollnumber;
		}
		public void setRollnumber(int rollnumber) {
			this.rollnumber = rollnumber;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
	public void checkresult() {
		if(marks<=40) {
			System.out.println("fail");
		}else {
			System.out.println("pass");
		}
	}
	public void displaydetails() {
		System.out.println("name"+name);
		System.out.println("rollnumber"+rollnumber);
		System.out.println("marks"+marks);
	}
     
}

public class OopsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Exam ob=new Exam();
        ob.setName("harshi");
        ob.setMarks(70);
        ob.setRollnumber(100);
        ob.checkresult();
        ob.displaydetails();
	}

}
