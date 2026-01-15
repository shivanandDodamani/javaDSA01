package video9;

public class string {
    public static void main(String args[]){
        String firstName = "shivanand";
        String lastName = "dodamani";
        String fullName = firstName + " @ " + lastName;
        System.out.println(fullName.length());

        for(int i = 0; i < fullName.length(); i++ ){
            System.out.print(fullName.charAt(i));
        }
    }

    
    
}
