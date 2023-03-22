package array;
import java.util.Scanner;
public class anotherreversearray {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]  = obj.nextInt();
        }
        System.out.println("normal array is ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("reverse array is: ");
        for(int i= array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}
