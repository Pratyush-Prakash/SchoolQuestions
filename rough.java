import java.util.Scanner;
public class rough {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];
        int index =-1;
        int start,mid,end;
        System.out.println("Enter values of array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter number to search: ");
        int n = obj.nextInt();
        start = 0;
        end = arr.length-1;
        while(start<=end)
        {
            mid =(start+end)/2;
            if(n==arr[mid])
            {
                index = mid;
                break;
            }else if(n<arr[mid])
            {
                end = mid-1;
            }else
                start = mid+1;
        }
        System.out.println(index);


    }
}






















































