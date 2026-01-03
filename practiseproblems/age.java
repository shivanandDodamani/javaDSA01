//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
// A person of age > 18 is eligible to vote.


package practiseproblems;

import java.util.*;

public class age {
    public static void ageofVoting( int age) {
        if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageofVoting(+ age);
    }
}
