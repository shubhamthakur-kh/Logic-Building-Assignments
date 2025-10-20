import java.util.Scanner;
class CountPosNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int posCount = 0;
		int negCount = 0;
		
		System.out.print("Enter 6 integers :");
		for(int i =0; i<num.length; i++){
			num[i] = sc.nextInt();
			
			if(num[i] > 0){
				posCount++;
			}
			else if(num[i] < 0){
				negCount++;
			}
		}
		System.out.println("Positive numbers : " + posCount);
		System.out.println("Negative numbers : " +negCount);
		sc.close();
	}
}