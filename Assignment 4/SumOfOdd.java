import java.util.Scanner;
class SumOfOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		int sum  = 0;
		for(int i=1; i<=num ; i++){
			if(i % 2 != 0){
				sum = sum + i ;
			}	
		}
		System.out.println("The sum of odd numbers from 1 to " +num + " is: " +sum);
		sc.close();
	}
}