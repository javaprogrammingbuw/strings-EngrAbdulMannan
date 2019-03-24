import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word first number the alphabet ");
		String n =scan.nextLine();
		System.out.println(n);
		System.out.println("result is"+doPrint(n));
		System.out.println("result is"+intToString(n));
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
	}
	public static char doPrint(String a) {
		for (int i=0;i<a.length()-1;i=i+2) {
			System.out.println(a.charAt(i));
		
		}
		return 0;
		
	}
	public static char intToString(String b) {
		for (int i=1;i<b.length();i=i+2) {
			//for (int j=1;j<b.length();j=j+2) {
				char c=b.charAt(i);
				//c=doPrint(b);
				
		//	}
			
		}
		return c;
	}
}
