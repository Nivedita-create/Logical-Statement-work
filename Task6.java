package logicalstatements;

public class Task6 {
	public static void main(String[]args) {
		int a = 236;
		int b = 32;
		int c = 34;
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c){
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
