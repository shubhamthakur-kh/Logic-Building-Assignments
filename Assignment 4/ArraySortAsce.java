import java.util.Scanner;
import java.util.Arrays;
class ArraySortAsce{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int [5];
		System.out.println("Enter 5 integers : ");
		
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();	
		}
		Arrays.sort(num);
		System.out.print("Sorted Array :");
		for(int numbers : num ){
			System.out.print(numbers + "  ");
		}
		sc.close();
		
	}
}