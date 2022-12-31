package array;

public class selectionarray {
    public static void main(String args[])
    {
        int list[] = {10,9,4,7,6,2,3,11,50,21};
        int l = list.length;
        for(int i=0;i<l-1;i++) {
            int minindex = i;
            for (int j = i + 1; j < l; j++) {
                if (list[j] < list[minindex]) {
                    minindex = j;
                }
            }
                System.out.println("Pass " + (i + 1) + " => swap " + list[i] + " and " + list[minindex]);
                int tmp = list[i];
                list[i] = list[minindex];
                list[minindex] = tmp;

        }
            System.out.println("Sorted array is: ");
            for(int i=0;i<l;i++)
            {
                System.out.println(list[i]);
            }

    }
}
