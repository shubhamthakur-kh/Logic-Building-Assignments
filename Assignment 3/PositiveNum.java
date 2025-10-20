import java.util.Scanner;

class PositiveNum {

    public static int askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("it's not a positive number");
            }
        } while (number <= 0);
        sc.close();
        return number;
    }
    public static void main(String[] args) {
        int positiveNum = askForPositiveNumber();
        System.out.println("You entered a positive number: " + positiveNum);
    }
}
