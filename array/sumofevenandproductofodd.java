package array;
import java.util.Scanner;

public class sumofevenandproductofodd {

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int sum =0,pro=1;

        int array[] = new int[10];
        System.out.println("Enter values of array: ");
        for(int i =0;i< array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        System.out.println("Values of array are: ");
        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
        for(int i=0;i< array.length;i++)
        {
            if(i%2 == 0)
            {
                sum = sum + array[i];
            }else if(i%2 == 1)
            {
                pro = pro*array[i];
            }
        }
        System.out.println("Sum of values at even indices are: "+sum);
        System.out.println("Product of values at odd indices are: "+pro);



    }
}
