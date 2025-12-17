package video3;

import java.util.*;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0) {          // % this operator is used to ckeck remainder
            System.out.print("its prime ");
        } else {
            System.out.print("its not prime ");
        }
        sc.close();
    }
    
}
