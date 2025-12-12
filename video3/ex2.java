package video3;
import java.util.*;
public class ex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
              System.out.println("Equal");                                                                              
        } else  if (a > b) {
            System.out.println("a is greater then b");
            
        } else {
            if (a < b){
            System.out.println("b is greater than a");
            }
        
    }
    sc.close();
    }
}
