package SeriesandPatterns;

public class fractionseries {
    public static void main (String args []){
        double s=0;

        for(int i = 1; i<=10; i++){
            s= s +(i/i+1);
        }
        System.out.println(s);
    }
}
