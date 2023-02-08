package normalprograms;
import java.util.Scanner;
// menu dirven program to check wether number input by user is palindrome or perfect
public class palindromeorperfect {
    public static void main (String args[])
    {
        int rev = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        System.out.println("Enter 1 for palindrome and 2 for perfect number");
        int p = obj.nextInt();
        int num = n;
        switch(p)
        {
            case 1:
                while(n>0)
                {
                    int d = n%10;
                    rev = rev*10 +d;
                    n = n/10;
                }
                if(num == rev)
                {
                    System.out.println("Number is a palindrome number");
                }else
                    System.out.println("Not a palindrome number");

            case 2:
                int sum = 0,i;
                for( i=1;i<n;i++) {
                    if (n % i == 0)
                        sum = sum + i;
                }
                    if(sum == n)
                    {
                        System.out.println("It is a perfect number");
                    }else
                        System.out.println("It is not a perfect number");





        }
    }

}
