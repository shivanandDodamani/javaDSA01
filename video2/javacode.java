package video2;

import java.util.Scanner;

public class javacode {
    public static void main(String[] args) {
        // variables type 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();
    int c = a+b;
    System.out.println(c);
    sc.close();
}
}
