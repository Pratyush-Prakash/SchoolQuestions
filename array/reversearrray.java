package array;
import java.util.*;
public class reversearrray {
    public static void main (String args [])
    {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[]{1,2,3,4};
        System.out.println("Original array ");
        for(int i=0;i<array.length;i++)
        {
            //array[i] = obj.nextInt();
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("Reversed array: ");
        for(int i =array.length-1;i>=0;i--){
            System.out.print(array[i]+ " ");
        }

    }
}
