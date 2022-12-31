package array;
import java.util.Scanner;
public class linearsearch {
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        int n;
        int[] array = new int[5];
        System.out.println("Enter values of array: ");
        for(int i =0;i<array.length;i++){
            array[i] = obj.nextInt();
        }
        System.out.println("Enter n: ");
        n = obj.nextInt();
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                System.out.println(i);
                break;

            }
        }

    }
}
