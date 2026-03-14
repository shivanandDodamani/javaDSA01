package vedio6;

import java.util.*;

public class primenumbers {

    public static void printPrime(int n) {

        if (n <= 1) {
            System.out.println("not a prime number");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("not a prime number");
                return;
            }
        }

        System.out.println("it is a prime number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
}