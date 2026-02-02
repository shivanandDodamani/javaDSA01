package video12;

public class Bitwise {
    public static void main(String args[]){
        int n = 5;
        int pos = 3;
        int bitMask = 1<<n;

        if((bitMask & n) == 0){
            System.out.println("bit is zero");
        }
        else {
            System.out.println("bit is non zero");
        }
    }
    
}
