import java.util.Scanner;
class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		
		String reverse = "";
		for(int i= str.length()-1; i >= 0; i--){
			reverse += str.charAt(i);
		}
		
		System.out.println("Reversed string is : " + reverse);
		sc.close();
	}
}

/*
Enter a string : shubham
Reversed string is : mahbuhs
*/