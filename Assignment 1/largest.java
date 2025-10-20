 class Large {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 2;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is" + largest);
    }
}
