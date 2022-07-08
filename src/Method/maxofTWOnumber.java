package Method;

public class maxofTWOnumber {
    public static int findmax(int x, int y) {
        int max;
        max = (x>y) ? x :y;
        return max;
    }
    public static void main (String args []) {
        int a = findmax(14,10);
        System.out.println(a);

    }

}
