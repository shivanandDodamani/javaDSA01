package video10;

public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));


        //set char at index 
        sb.setCharAt(0, 'p');
        System.out.println(sb);


    }
    
}
