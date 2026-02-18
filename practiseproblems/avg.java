package practiseproblems;

import java.util.*;

public class avg {
    public static void avarageof3Numbers( int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum /3;
     System.out.println("the avarage of 3 numbers is " + avg);
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
       avarageof3Numbers(a, b, c);
       sc.close();
    }
}
