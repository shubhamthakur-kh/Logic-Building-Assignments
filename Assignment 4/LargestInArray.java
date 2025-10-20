import java.util.Scanner;
import java.util.Arrays;
class LargestInArray{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter 5 integers :");
		
		for(int i=0;i<num.length; i++){
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int largest = num[num.length-1];
	
		System.out.println("The largest element is : " +largest); 	
	    sc.close();
	}
}