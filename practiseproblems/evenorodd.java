package practiseproblems;

import java.util.*;

public class evenorodd {
    public static void evenorodd(int n) {
        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
    }
    
}
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    evenorodd(n);
  }
}