import java.util.Scanner;

class SumCalc{
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = sumOfTwoNumbers(num1, num2);
        System.out.println("The sum of " +num1+ "and" +num2 + "is" +sum);

        scanner.close();
    }
}
