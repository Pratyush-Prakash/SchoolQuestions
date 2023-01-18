import java.util.Scanner;
public class rough {

    public static void main(String args [])
    {
        // Bubble Sort
        Scanner obj = new Scanner(System.in);
        String arr[] = new String[10];
        System.out.println("Enter elements of array: ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = obj.nextLine();
        }
        System.out.println("Unsorted array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j+1].compareTo(arr[j])>0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }










    }

    }

