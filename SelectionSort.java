public class SelectionSort {
    public static void printSortArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,8,5,11,14,15,6,5,9,12};
       // Time Complexity O(n^2)
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                smallest=j;

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;


        }
        printSortArr(arr);
        
    }
    
}
