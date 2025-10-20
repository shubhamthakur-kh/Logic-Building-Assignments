import java.util.Scanner;

class SumCalculator {
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = calculateSum(n);
        System.out.println("Sum of integers from 1 to " + n + " is: " + result);
         sc.close();
    }

}