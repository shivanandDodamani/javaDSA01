package video7.arrays;

import java.util.*;

public class ques6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of array elements is: " + sum);
        sc.close();
        
    }
    
}
