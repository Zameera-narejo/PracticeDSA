
public class BubbleS {

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={10,8,5,11,14,15,6,5,9,12};
        // Time complexity O(n^2)
        for(int i=0;i<arr.length-1;i++)//  Loop time complexity n-1
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;
                }
            }
        }
        printArray(arr);
        
    }

    
}