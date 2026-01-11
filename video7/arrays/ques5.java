package video7.arrays;

import java.util.*;

public class ques5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // assume first element is largest
        int largest = arr[0];

        // compare with rest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
        sc.close();
    }
}

    

