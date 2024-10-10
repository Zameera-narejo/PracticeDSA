package LAB06;
import java.util.Arrays;

public class SumTwoN {
    public static void Sum(int arr[],int n)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<right/2;j++)
            {
                int mid=right/2;
                arr[mid+i]=n;

            }
        }


    }
    
}
