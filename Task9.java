package logicalstatements;

public class Task9 {
	public static void main(String[]args) {
		char ch = '&';
		if((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z')){
			System.out.println("Alphabete");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special charcter");
		}
	}

}
