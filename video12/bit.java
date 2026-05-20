package video12;

import java.util.*;

public class bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int pos = 1;

        int bitMask 1<<i;
        if(oper == 1) {
            int newNumber = bitMask | n;
            System.out.print(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.print(newNumber);
        }


    }
}