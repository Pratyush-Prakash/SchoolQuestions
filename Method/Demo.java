package Method;

public class Demo {
  //  int a=10;
   // int b =11;
     int hello(int x , int y){
        int result = x+y;
        return result;
    }
    public static void main (String args []){
        int a=10;
        int b=11;
        //int c = hello(a,b);
        Demo obj = new Demo();
        obj.hello(a,b);
    }
}
