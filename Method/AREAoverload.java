package Method;
import java.util.Scanner;
public class AREAoverload {
    public    double area(double a,double b,double c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
     public   double area(int a,int b,int height){
        double area =1/2*height*(a+b);
        return area;
     }
     public   double area(double diagonal1,double diagonal2){
        double area = 1/2*(diagonal1*diagonal2);
        return area;
     }



}
