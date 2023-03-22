package strings;
import java.util.Locale;
import java.util.Scanner;
public class numberofwords {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("input string");
        String n = obj.nextLine();
        n = " "+n;
        n = n.toUpperCase();
        System.out.println(n);
        int c =0;
        for(int i=0;i<n.length();i++)
        {
            if(   n.charAt(i) == ' ' && n.charAt(i+1) == 'A' )
            {
             c++;
            }
        }
        System.out.println(c);
    }
}
