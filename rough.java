import java.util.Scanner;
public class rough {

    public static void main(String args [])
    {
        // linear search
        Scanner obj = new Scanner(System.in);
        int array[] = new int[5];
        int n;
        System.out.println("Enter values of array: ");
        for(int i =0;i< array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        System.out.println("Values of array: ");
        for(int i =0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Enter number to be searched: ");
        n = obj.nextInt();;
        for(int i=0;i<array.length;i++)
        {
            if(array[i] == n){
                System.out.println(i);
                break;
            }

        }

    }

    }

