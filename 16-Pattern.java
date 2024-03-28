package com.saurabh;

public class pattern {
    public static void main(String[] args) {
        pattern28(8);

    }
    static void pattern1(int n){
        for(int r=1;r<=n;r++)
        {
            for(int c=1; c<=n-r+1;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

