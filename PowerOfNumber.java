import java.util.Scanner;
public class PowerOfNumber{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("Finding the power X over N -");
		System.out.println("Enter value of Number(N) whose power you need to find -");
		int number = in.nextInt();
		System.out.println("Enter the power(X) value -");
		int power = in.nextInt();

		int value=1;
		while(power>0){
		value*=number;
		power--;
		}
		System.out.println("N power X value is "+value);

	}
	
}