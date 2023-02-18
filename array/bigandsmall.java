package array;
import java.util.Scanner;
public class bigandsmall {
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter values of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        int min,max;
        min = array[0];
        max = array[0];
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            } if(array[i]<min)
            {
                min = array[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);







    }
}
