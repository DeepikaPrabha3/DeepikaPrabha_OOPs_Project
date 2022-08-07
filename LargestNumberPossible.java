import java.util.Scanner;
public class LargestNumberPossible {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("Finding the Largest number possible from an array -");
		System.out.println("Enter the length of array-");
		int length=in.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the array elements -");
		for(int i=0;i<length;i++){
			arr[i]=in.nextInt();
		}
			for(int i=0;i<length;i++){
				for(int j=i+1;j<length;j++){
					int tmp=0;
					if(arr[i]>arr[j]){
						tmp=arr[i];
						arr[i]=arr[j];
						arr[j]=tmp;
					}

				}
			
			}
			System.out.println("Largest Possible number with the given array elements is ");
			for(int k=length-1;k>=0;k--){
				
				System.out.print(arr[k]);
			}
		}
	
}