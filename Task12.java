package logicalstatements;

public class Task12 {
	public static void main(String[]args) {
		int a= 3;
		int b= 4;
		int c= 15;
		if(a+b>c&& b+c>a&& c+a>b) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}

}
