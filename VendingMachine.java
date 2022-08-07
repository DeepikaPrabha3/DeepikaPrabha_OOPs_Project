import java.util.Scanner;
public class VendingMachine{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("'Welcome to EasyBuy Vending Machine!'");
		System.out.println("------------------------------------");
		System.out.println("Loading the Vending Machine with Products....");
		

		System.out.println("Below are the available products and their price respectively..");
		System.out.println("1. Lays - 15/-");
		System.out.println("2. Bingo - 25/-");
		System.out.println("3. Amul Cool - 20/-");
		System.out.println("4. Maaza - 10/-");
		System.out.println("5. Hide N Seek - 20/-");

		int sum=0;
		int totalAmount=0;
		char ans='y';
		int i=0;
		do{		
				System.out.println("Choose any Number(1-5)");
				sum+=withdraw(in.nextInt());
				System.out.println("Do you want to add another product?(y/n)-");
				ans=in.next().charAt(0);
				i++;
		}while(ans=='y');

		System.out.println("Processing the Cart...");
		System.out.println("Available Payment Modes-");
		System.out.println("1. Cash Payment");
		System.out.println("2. Card Payment (amount to be paid would be doubled)");
		System.out.println("Enter the payment mode(1 or 2) -");
		int paymentMode=in.nextInt();
		if(paymentMode==2)
		{	
			totalAmount=2*sum;
			System.out.println("Amount to be paid - Rs"+totalAmount);
		}
		else
		{
			totalAmount=sum;
			System.out.println("Amount to be paid - Rs"+totalAmount);

		}
	}
	public static int withdraw(int input){
		int amountForItem=0;
			switch(input){
				case 1:amountForItem = 15;
						break;
				case 2: amountForItem = 25;
						break;
				case 3: amountForItem = 20;
						break;
				case 4:amountForItem =10;
						break;
				case 5:amountForItem = 20;
						break;
				}
		return amountForItem;
	}

		
	
}

