package strings;
import java.util.Scanner;
public class oppositecase {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String sentence = obj.nextLine();
        String newstring ="";
        char tmpchar;
        for(int i=0;i<sentence.length();i++)
        {
            tmpchar = sentence.charAt(i);
            if(tmpchar >= 'a'&& tmpchar<= 'z')
            {
                newstring = newstring+ Character.toUpperCase(tmpchar);
            }else if(tmpchar >= 'A' && tmpchar<= 'Z')
            {
                newstring = newstring +Character.toLowerCase(tmpchar);
            }else
                newstring = newstring + tmpchar;
        }
        System.out.println(newstring);
    }
}
