package Method;
import java.util.Scanner;
public class rectangle {
    int l,b,a,p;
    double d;
    public void inputdata(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length: ");
        l = obj.nextInt();
        System.out.println("Enter breadth: ");
        b = obj.nextInt();
    }
    public void calcuate(){
        p = 2*(l+b);
        a = l*b;
        d = Math.sqrt(l*l + b*b);
    }
    public void output(){
        System.out.println("area: "+a);
        System.out.println("perimeter: "+p);
        System.out.println("diagonal: "+d);
    }
    public static void main (String args []){
        rectangle sc = new rectangle();
        sc.inputdata();;
        sc.calcuate();
        sc.output();
    }
}
