package array;
import java.util.*;
public class inputofarray {
public static void main (String args []) {
    Scanner obj = new Scanner(System.in);
   /*
    int[] array = new int[5];
    for(int i=0;i<array.length;i++){
        array[i]= obj.nextInt();
        System.out.println(array[i]);
    }
    */
    int n;

    System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
    n= obj.nextInt();
//creates an array in the memory of length 10
    int[] array = new int[10];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
//reading array elements from the user
        array[i]=obj.nextInt();
    }
    System.out.println("Array elements are: ");
// accessing array elements using the for loop
    for (int i=0; i<n; i++)
    {
        System.out.println(array[i]);
    }



































}}