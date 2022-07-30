package Method;

public class maxofTWOnumber {
    public  int findmax(int x, int y) {
        int max;
        max = (x>y) ? x :y;
        return max;
    }
    public static void main (String args []) {
        maxofTWOnumber obj = new maxofTWOnumber();
        int a  = obj.findmax(1,10);
      //  int a = findmax(14,10);
        System.out.println(a);

    }

}
