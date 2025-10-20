class DiamondPattern8 {
    public static void main(String[] args) {
        int rows = 10; // total height is rows*2 - 1

        // Upper half (including middle line)
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/