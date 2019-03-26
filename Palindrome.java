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
	public static boolean isPalindrome(String a) {

		//This just works for the trivial case

		a.replace("\\s", "");
		for (int i=0;i<a.length()/2;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-1-i)   ){
				//&& Character.isUpperCase(a.charAt(i)) && Character.isLowerCase(a.charAt(i))
				//System.out.println(i + ", " + a.charAt(i) + ", " + (a.length()-1-i) + ", " + a.charAt(a.length()-1-i));
				return false;
			}
			else if (Character.isUpperCase(a.charAt(i))&&Character.isLowerCase(a.charAt(i))) {
				isPalindrome(a);
			}
			else if(Character.isSpaceChar(a.charAt(i))) {
				isPalindrome(a);
			}
			
	
		
			
		}
		return true;
	}
}