package array;
import java.util.Scanner;
public class linearsearchchar {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        String string[] = new String[5];
        System.out.println("Enter values of array: ");
        for(int i=0;i<string.length;i++)
        {
            string[i] = obj.nextLine();
        }
        System.out.println("Enter value to be searched: ");
        String value = obj.nextLine();
        for(int i=0;i<string.length;i++)
        {
            if(value.equalsIgnoreCase(string[i]))
            {
                System.out.println(i);
                break;
            }
        }



    }
}
