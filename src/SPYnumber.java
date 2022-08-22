import java.util.Scanner;
/*sum of digits = products of digit*/
public class SPYnumber {
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int s=0,d,p=1;
        while(n>0){
            d = n%10;
            s =s+d;
            p=p*d;
            n=n/10;

        }
        if(s==p){
            System.out.println("spy");
        }else{
            System.out.println("not spy");
        }
    }
}
