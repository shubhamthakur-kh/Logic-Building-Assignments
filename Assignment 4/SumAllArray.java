import java.util.Scanner;
import java.util.Arrays;
class SumAllArray{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 int[] numbers = new int[5];
	 int sum = 0;
	 System.out.println("Enter 5 integers : ");
	 for(int i=0 ; i<numbers.length ; i++){
		numbers[i]= sc.nextInt();	
	 }
	 for(int num : numbers){
		 sum = sum + num ;
	 }
	 System.out.print("The sum of all numbers is : "  + sum );
	 sc.close();
 }
}