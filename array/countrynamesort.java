package array;
import java.util.*;
public class countrynamesort {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter names: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = obj.nextLine();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length-1;j++)
            {
                if (arr[j].compareTo(arr[j+1]) >0) {
                    String tmpstr = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmpstr;
                }
            }

        }
        System.out.println("Sorted list is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
