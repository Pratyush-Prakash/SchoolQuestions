package strings;
import java.util.*;

public class characterofstring {
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        String n = obj.nextLine();
        int d = n.length()-1;
        for(int i=0;i<=d;i++){
            char c = n.charAt(i);
            System.out.println(c);
        }


    }
}
