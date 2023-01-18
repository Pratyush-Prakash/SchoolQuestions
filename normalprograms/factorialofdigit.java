package normalprograms;
import java.util.*;
public class factorialofdigit {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = obj.nextInt();
        int d=1,fact=1,sum=0;
        while(n>0)
        {
            d=n%10;
            for(int i=1;i<=d;i++)
            {
                fact = fact*i;
            }
            System.out.println(fact);
            fact =1;

            n=n/10;
        }


    }
}
