package Loops;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n-1;
        int star = 1;


        while(row<=n) {

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;

            while (j <= star) {
                if(j%2!=0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            // next line prep

            System.out.println();
            row++;
            star += 2;
            space--;
        }
    }
}
