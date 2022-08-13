package String_Questions;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "Java Coding";
		String revString = Reverse(str);
		System.out.println(revString);
	}
	
	public static String Reverse(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev +=str.charAt(i);
		}	
		return rev;
	}
}


