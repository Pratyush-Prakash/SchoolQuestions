package array;
import java.util.Scanner;
public class tennames {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 names: ");
        for(int i=0;i<names.length;i++)
        {
            names[i] = obj.nextLine().toUpperCase();
        }
        System.out.println("Enter the name to search: ");
        String ye = obj.nextLine().toUpperCase();
        int index=-1;
        for(int i=0;i< names.length;i++)
        {
            if(ye.equalsIgnoreCase(names[i]))
            {
                index = i;
                break;
            }
            if(names[i].startsWith("SRI"))
            {
                System.out.println(names[i]);
            }
        }
        System.out.println(index);

    }
}
