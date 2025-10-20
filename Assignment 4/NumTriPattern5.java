class NumTriPattern5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {         // Outer loop: controls rows
            for (int j = 1; j <= i; j++) {     // Inner loop: prints i, i times
                System.out.print(i);
            }
            System.out.println();                 
        }
    }
}


/*
1
22
333
4444
55555

*/
