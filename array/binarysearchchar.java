package array;
import java.util.Scanner;
public class binarysearchchar {
    public static void main(String args[])
    {
        int index =-1;
        int start,mid,end;
        Scanner obj = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter values of array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = obj.nextLine();

        }
        System.out.println("Enter value to be searched: ");
        String value = obj.nextLine();
        start =0;
        end = arr.length-1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(value == arr[mid])
            {
                index = mid;
                break;
            }else if(value.compareTo(arr[mid]) > 0)
                end = mid-1;
            else
                start = mid+1;
            }
        System.out.println(index);
        }

    }

