package video5;

public class puramid {
    static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j<=n-i; j--) {
                System.out.print(" ");

                }

                for (int j = 1; i <= 2*i-1; i++) {
                    System.out.print("*");

                }
                System.out.println();
        }

        for (int i = n; i >=1; i--) {
            for (int j = n; j<=n-i; j--) {
                System.out.print(" ");

                }

                for (int j = 1; i <= 2*i-1; i++) {
                    System.out.print("*");

                }
                System.out.println();
        }

        }
    }

    
    
   
        
    

