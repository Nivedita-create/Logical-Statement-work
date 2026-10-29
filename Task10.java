package logicalstatements;

public class Task10 {
	public static void main(String[]args) {
		/*char ch = 'e';
		if((ch=='a')||ch=='e'|| ch=='i'||
				ch=='o'||ch=='u'||ch=='A'||ch=='E'||
				ch=='I'||ch=='O'||ch=='U') {
			System.out.println("print vowel");
		}
		else if ((ch=='A'&&ch=='Z')||ch=='a'&&ch=='z'){
			System.out.println("consonant");
		}
		else {
			System.out.println("not a alphabate");
		}*/
		int sp = 500;
		int cp = 500;
		if(sp>cp) {
			System.out.println("Profit " + (sp-cp));
		}
		else if(sp<cp) {
			System.out.println("loss " + (cp-sp));
		}
		else {
			System.out.println("not p not loss");
		}
			
	}

}
