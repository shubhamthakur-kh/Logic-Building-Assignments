import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		
		int sum  = 1;
		for(int i=1; i<=num ; i++){
			sum = sum * i ;	
		}
		System.out.println("Factorial of " +num + " is " +sum);
		sc.close();
	}
}