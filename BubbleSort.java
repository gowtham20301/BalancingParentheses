package Demo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
            int[] arr= {2,5,7,1,3,6};
            int len=arr.length-1;
            for(int j=1;j<arr.length;j++)
            {
                for (int i = 0; i <len-j; i++)
                {
                    if (arr[i] > arr[i + 1])
                    {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}