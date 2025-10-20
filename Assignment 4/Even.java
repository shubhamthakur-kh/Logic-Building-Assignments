import java.util.Scanner;
class Even{
	public static void main(String arge[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		for(int i=1 ; i<=num ; i++){
			if(i % 2 ==0){
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}