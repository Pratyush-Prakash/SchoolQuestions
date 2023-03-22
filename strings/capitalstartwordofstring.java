package strings;
import java.util.Scanner;
public class capitalstartwordofstring {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string full of words: ");
        String n = obj.nextLine();
        n = " "+n;
        String tmp = "";

        for(int i=0;i<n.length();i++)
        {
            char ch = n.charAt(i);
            if(ch == ' ')
            {
                tmp = tmp+ ch;
                i++;
                ch = n.charAt(i);
                tmp = tmp + Character.toUpperCase(ch);
            }else
                tmp = tmp+ch;
        }
        tmp = tmp.trim();
        System.out.println(tmp);

















    }
}
