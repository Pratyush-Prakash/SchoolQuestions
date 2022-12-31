package array;
import java.util.*;
public class binarysearch {
public static void main (String args []) {
  Scanner obj = new Scanner(System.in);
  int n;
  int index = -1;
  int start,end,mid;
  int[] array = new int[5];
    System.out.println("Enter values of array: ");
  for(int i=0;i<array.length;i++)
  {
      array[i] = obj.nextInt();
  }
    System.out.println("Enter number to be searched: ");
   n = obj.nextInt();
  start = 0;
  end = array.length-1;
  while(start<=end){
      mid = (start+end)/2;
  if(n==array[mid]) {
      index = mid;
      break;
  }else if(n<array[mid]){
      end = mid-1;
  }else
      start = mid+1;
  }
  if(index>=0){
      System.out.println("index of "+ n+" is "+index );
  }else
      System.out.println("not found");


}

}

