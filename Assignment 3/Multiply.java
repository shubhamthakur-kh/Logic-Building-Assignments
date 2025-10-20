import java.util.Scanner;
class Multiply {
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        printMultiplicationTable(5);
    }
}
