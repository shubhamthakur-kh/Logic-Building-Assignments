import java.util.Scanner;
import java.util.Arrays;
class ArrayCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num2 = sc.nextInt();

        if (Arrays.asList(num).contains(num2)) {
            System.out.println("Found");
        } 
		else {
            System.out.println("Not Found");
        }
		sc.close();
    }
}
	