package logicalstatements;

public class Task7 {
	public static void main(String[]args) {
		 int rollNo = 101;
		 String Name = "ravi";
		 int math = 70;
		 int java = 80;
		 int english = 60;
		  int total = math + java + english;
		  double percentage = total/3;
		  
		  System.out.println("Roll no =" +rollNo);
		  System.out.println("Name =" +Name);
		  System.out.println("Total =" +total);
		  System.out.println("percentage =" +percentage);
		  if(math>=33 && java >=33 && english>=33) {
			  System.out.println("Result = Pass");
			  if(percentage>=90) {
				  System.out.println("Grade = A+");
			  }
			  else if(percentage>=80) {
				  System.out.println("Grade = A");
			  }
			  else if(percentage>=60) {
				  System.out.println("Grade = B");
			  }
			  else if(percentage>=50) {
				  System.out.println("Grade = C");
			  }
			  else {
				  System.out.println("Fail");
			  }
		  }

		 
	}

}
