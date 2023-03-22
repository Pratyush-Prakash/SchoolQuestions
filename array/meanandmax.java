package array;
import java.util.Scanner;
public class meanandmax {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("ENter values of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        int l = array.length;
        int sum=0;
        double mean;
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            sum = sum+array[i];
        }
        mean = sum/l;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>mean)
            {
                max = i;

            }
        }
        System.out.println(mean);
        System.out.println(max);
    }
}
