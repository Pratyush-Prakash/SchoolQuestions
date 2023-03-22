package array;
import java.util.Scanner;
public class operationsonnumbers {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[20];
        // input array
        System.out.println("Enter numbers of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        int larg,small,sum;
        larg = array[0];
        small = array[0];
        sum = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>larg)
                larg = array[i];
            if(array[i]<small)
                small = array[i];
            sum = sum+array[i];
        }
        System.out.println(larg);
        System.out.println(small);
        System.out.println(sum);

    }
}
