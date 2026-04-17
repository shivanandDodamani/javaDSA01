package video7.arrays;

import java.util.*;

public class target {
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the array elements:");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for (int i = 0; i < size; i++) {
        numbers[i] = sc.nextInt();
    }

    System.out.println("Enter the target number:");
    int target = sc.nextInt();
    int count = 0;
    for (int i = 0; i < size; i++) {
        if (numbers[i] == target) {
            count++;
        }
    }
    System.out.println("The target number appears " + count + " times in the array.");
    sc.close();
    }
    
}
