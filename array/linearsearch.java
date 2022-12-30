package array;
import java.util.Scanner;
public class linearsearch {
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        int[] array = {1,2,4,6,4,2,3,675,777,333,777,2};
        System.out.println("Enter number to be searched: ");
        int n = obj.nextInt();
        for(int i=0;i< array.length;i++){
            if(array[i]== n)  {
                System.out.println(i);
                break;
            }
        }

    }
}
