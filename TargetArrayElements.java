import java.util.Scanner;
public class TargetArrayElements {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("Finding the index pairs of an array whose values add to a target value -");
		System.out.println("Enter the length of array-");
		int length=in.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the nums[] array elements -");
		for(int i=0;i<length;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the target value-");
		int target=in.nextInt();
		int index1=0,index2=0;
		boolean found=false;
		int i=0,j=1;

				while(i< length && j<length){
						if((i!=j) && (arr[i]+arr[j]==target)){
							found=true;
							System.out.println("Index Pairs : "+"["+i+","+j+"]"+",nums["+i+"]+nums["+j+"]="+target);
						}
						 if(arr[i]+arr[j]<target)
							{
								j++;
						    }
							
							else{
								i++;
							}

					}
					if(!found){
						System.out.println("Target not found");
					}
		
		
		}
	
}