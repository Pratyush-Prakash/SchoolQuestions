package normalprograms;

import java.util.Scanner;
public class SUMandPRODUCTofDIGITofNUMBER {
    public static void main (String args []) {
        int d,sum=0,pro=1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = obj.nextInt();
        while(n>0){
            d=n%10;
            System.out.println(d);
            n=n/10;
            sum = sum+d;
            pro=pro*d;
        }
        System.out.println("sum = "+sum);
        System.out.println("product = "+pro);


    }
}
