import java.util.Scanner;
class Even{
	public static void printEvenNumbers() {
    int number = 1;
    while (number <= 50) {
        if (number % 2 == 0) {
            System.out.println(number);
        }
        number++;
    }
}
	public static void main(String[] args) {
    printEvenNumbers();
}

}

