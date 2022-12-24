package normalprograms;

import java.util.Scanner;
/*
12 = 3*4
20 = 5*4
42 = 7*6
 */
public class PRONICnumber{
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= obj.nextInt();
       // int flag =0;
        boolean bool = false;
        for(int i=1;i<=10;i++){
            if(i*(i+1)==n){
             //   flag = 1;
                 bool = true;
                break;
            }
        }
        if(bool ==true){
            System.out.println("It is a pronic number");
        }else
            System.out.println("It is not a pronic number");
    }
}


