package practiseproblems;

public class sumofodd {
    public static void sumofOdd(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if ( i%2 != 0) {
                sum = sum + 1;
            }
        }
    }
    
}
