//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
// A person of age > 18 is eligible to vote.


package practiseproblems;

import java.util.*;

public class age {
    public static boolean ageofVoting( int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yor age");
        int age = sc.nextInt();
        if(ageofVoting(age)){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
        sc.close();
    }
}
