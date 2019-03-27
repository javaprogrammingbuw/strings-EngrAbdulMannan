import java.util.Locale;
import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name ");
		String n =scan.nextLine();
		System.out.println("The input is palindrome"+isPalindrome(n));
		//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
		//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
		//Ignore upper and lower case. 'Hannah' is a palindrome, too.
		//Ignore also spaces. 'Taco cat' is a valid palindrome.

	}
	public static boolean isPalindrome(String a0) {
		//a0.replace("\\s", "");
		String b="";
		String a=a0.toLowerCase();
		for (int j=0;j<a.length();j++) {
			if(!Character.isWhitespace(a.charAt(j))) {
				b+=a.charAt(j);
			}

		}

		for (int i=0;i<b.length()/2;i++) {
			if(a.charAt(i)!=b.charAt(b.length()-1-i)   ){
				//&& Character.isUpperCase(a.charAt(i)) && Character.isLowerCase(a.charAt(i))
				//System.out.println(i + ", " + a.charAt(i) + ", " + (a.length()-1-i) + ", " + a.charAt(a.length()-1-i));
				return false;
			}
			else if (Character.isUpperCase(b.charAt(i))&&Character.isLowerCase(b.charAt(i))) {
				isPalindrome(b);
			}
			else if(Character.isSpaceChar(b.charAt(i))) {
				isPalindrome(b);
			}




		}
		return true;
	}
}