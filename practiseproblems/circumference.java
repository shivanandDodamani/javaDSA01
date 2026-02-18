package practiseproblems;

import java.util.*;

public class circumference {
    public static void circumferenceofCircle( int r) {
        double circumference = 2 * 3.14 * r;
        System.out.println("circumference of circle is" + circumference);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumferenceofCircle((int)r);
        sc.close();
    }
    
}
