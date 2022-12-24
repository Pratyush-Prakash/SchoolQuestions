import java.util.Scanner;
public class PALINDROMEnumber {
    public static void main (String args []){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum =0;
        int i=n;
        int d=0;
        while( i>0){
             d = i%10;
            sum = (sum*10)+d;
            i=i/10;
        }
        if(n==sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

