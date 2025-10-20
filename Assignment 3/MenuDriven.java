import java.util.Scanner;

public class MenuDriven {

    public static void gradeEvaluation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    
    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day number.");
        }
    }

    
    public static void defaultValues() {
		byte a = 1;
        short b = 2;
        int c = 3;
        long d = 9L;
        float e = 8.0f;
        double f = 2.0;
        char g = 'S';
        boolean h = true;
		
        System.out.println("byte a = " + a);
        System.out.println("short b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float e = " + e);
        System.out.println("double f = " + f);
        System.out.println("char g = " + g);
        System.out.println("boolean h = " + h);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: gradeEvaluation(); break;
                case 2: checkLeapYear(); break;
                case 3: dayOfWeek(); break;
                case 4: defaultValues(); break;
                case 5: System.out.println("Exiting program"); break;
                default: System.out.println("Invalid choice");
            }
        } while (choice != 5);

        scanner.close();
    }
}
