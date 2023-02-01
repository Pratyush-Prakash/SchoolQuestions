package normalprograms;
import java.util.*;
/*
Write a program to accept a two digit number if sum of (sum of digit and product of digit) is equal to the number it is a special number
 */


public class specialnumber {
    public static void main(String args[])
    {
       Scanner obj = new Scanner(System.in);
        System.out.println("Enter two digit number: ");
       int n = obj.nextInt();
       int sum, product;
       int a=n/10;
       int b = n%10;
       sum = a+b;
       product = a*b;
       if(sum+product == n)
           System.out.println("yea");
       else
           System.out.println("nah");

    }


}
