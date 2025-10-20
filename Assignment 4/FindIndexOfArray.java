import java.util.Scanner;
import java.util.Arrays;
class FindIndexOfArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter 5 integers : ");
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.print("Enter the number to search : ");
		int num2 = sc.nextInt();
		
		int index = Arrays.binarySearch(num, num2);
		if(index >= 0){
			System.out.println(" The number " + num2 + " is found at index " +index);
		}else{
			System.out.println("Not Found");
		}
		sc.close();
	}
}