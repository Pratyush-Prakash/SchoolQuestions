package array;

import java.util.Scanner;

public class bubblearray {
    public static void main (String args [])
    {
        Scanner obj = new Scanner(System.in);
        int list[] = new int[10];
        int l = list.length;
        for(int i=0;i<l;i++)
        {
            list[i] = obj.nextInt();
        }
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(list[j]>list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    /*
                    j ka value in temp
                    j+1 ka value in j
                    temp ka value in j+1
                     */
                }
            }
        }
        for(int i =0;i<l;i++)
        {
            System.out.println(list[i]);
        }
    }
}
