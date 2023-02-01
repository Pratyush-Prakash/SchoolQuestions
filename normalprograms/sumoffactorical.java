package normalprograms;
import java.util.Scanner;
/*
if sum of factorial of digit is equal to original number
 */
public class sumoffactorical {
    public static void main (String args[])
    {
        int n , t , digit, f,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = obj.nextInt();
        t = n;
        while(n>0)
        {
            f=1;
            digit= n%10;
            for(int i=1;i<=digit;i++)
            {
                f =f*i;
            }
            sum = sum+f;
            n=n/10;
        }
        System.out.println(sum);
        if(sum == t)
            System.out.println("yea");
        else
            System.out.println("nah");

    }

}
