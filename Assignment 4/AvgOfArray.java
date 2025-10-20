import java.util.Scanner;
import java.util.Arrays;
class AvgOfArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("Enter 5 integers :");
		
		for(int i=0 ; i<num.length ; i++){
			num[i] = sc.nextInt();
		}
		
		double sum=0;
	    for(int numbers : num){
			sum = sum + numbers;
		}
		double average = sum / num.length ;
		System.out.println("The average of given numbers is : " + average);
		sc.close();
	}
}