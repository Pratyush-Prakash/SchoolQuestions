package strings;
import java.util.Scanner;
public class reverseandnumberofvovels {
    public static void main (String args [])
    {
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = obj.nextLine().toUpperCase();
        String newstring = "";
        int c=0;
        for(int i = word.length()-1;i>=0;i--)
        {
            char ch = word.charAt(i);
            newstring = newstring+ch;
            if(ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch=='U')
            {
                c++;
            }
        }
        System.out.println(newstring);
        System.out.println(c);
    }
}
