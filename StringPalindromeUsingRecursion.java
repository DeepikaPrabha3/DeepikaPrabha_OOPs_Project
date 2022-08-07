import java.util.Scanner;
public class StringPalindromeUsingRecursion{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("String Palindrome or Not?");
		System.out.println("Enter the string -");
		String str = in.nextLine();
		int i=0;
		int length=str.length();
		int j=length-1;

		System.out.println(isPalindrome(i,j,str));

	}

	public static boolean isPalindrome(int i,int j,String str){
		boolean isPal;

			if(str.charAt(i)==str.charAt(j)){
				isPal=true;
				i++;
				j--;
				if(i<j)
					return isPalindrome(i,j,str);
			}
			else 
				return false;
		

		return isPal;
	}
	
}