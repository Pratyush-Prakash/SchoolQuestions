import java.util.Scanner;
// sum of cube of number is equal to number
public class Dudneynumber {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
       for(int i=n;i!=0;i=i/10)
       {
           sum += i%10;
       }
       int cube = (int)Math.pow(sum,3);
        if(n == cube)
        {
            System.out.println("It is a dudeny number");
        }else
            System.out.println("It is not a dudney number");

    }
}
