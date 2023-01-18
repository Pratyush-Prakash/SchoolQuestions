package array;

public class bubblearray {
    public static void main (String args [])
    {
        int list[] = {7,8,3,1,2};
        int l = list.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-1;j++)
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
