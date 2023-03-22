
import java.util.Scanner;
public class rough {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String[] array = new String[10];
        System.out.println("Enter values of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = obj.nextLine();
        }
        System.out.println("Enter number to search: ");
        String n = obj.nextLine();
        int index= -1;
        int start =0;
        int end = array.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(n.compareTo(array[mid]) == 0)
            {
                index = mid;
                break;
            }else if(n.compareTo(array[mid])>0)
            {
                start = mid+1;
            }else if(n.compareTo(array[mid])<0)
            {
                end = mid-1;
            }
        }
        if(index>=0)
        {
            System.out.println(index);
        }else
            System.out.println("no nigga");













        }


















}











































































