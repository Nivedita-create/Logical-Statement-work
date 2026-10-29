package logicalstatements;

public class Task8 {
	public static void main(String[]args) {
		/*int a = 5;
		int b = 3;
		int c = 2;
		if(a==b && b==c) {
			System.out.println("Equiletral triangle");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("Isosceles triangle");
		}
		else {
			System.out.println("Scalene triangle");
		}*/
		
		int a = 21;
		if(a>=0) {
			System.out.println("Freeze");
	
		}
		else if(a>=20) {
			System.out.println("Cold");
		}
		else if(a>=30) {
			System.out.println("Normal");
		}
		else if(a>=40) {
			System.out.println("Hot");
		}
		else {
			System.out.println("Very hot");
		}
	}

}
