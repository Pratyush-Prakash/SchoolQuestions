
import java.util.*;
public class hmm {
    /*
    Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.

     */
    public static void main (String args [])
    {
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter your string: ");
      String n = obj.nextLine();
     // n = " ";
      String word= "";
      n = n.toLowerCase();
      int l = n.length();
      for(int i=0;i<l;i++)
      {
          if(  i== 0 || n.charAt(i-1)==' ' )
          {
              word = word + Character.toUpperCase(n.charAt(i));

          }else
          {
              word = word + n.charAt(i);
          }
      }
        System.out.println(word);

    }
}
