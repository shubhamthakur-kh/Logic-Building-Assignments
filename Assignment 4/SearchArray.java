import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[5];
		
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("\nEnter a number to search: ");
        int target = scanner.nextInt();

        if (Arrays.asList(numbers).contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
