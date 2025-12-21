package video6;

import java.util.*;

public class adavancepattern {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }


            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j<= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd patt
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
}
        // lower half
        for (int i = 1; i>=n; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }


            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j<= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd patt
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
    
}
}
