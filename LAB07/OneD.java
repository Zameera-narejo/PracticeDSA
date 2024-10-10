package LAB07;

public class OneD {
    public static void PrintOneDCh(char arr[],int i)
    {
        if(i==arr.length)
        return;
        else{
            PrintOneDCh(arr, i+1);
            System.out.print(arr[i]+" "); 
        }  
    }

    public static void PrintOneDChF(char arr[],int i)
    {
        if(i==arr.length)
        return;
        else{
            System.out.print(arr[i]+" "); 
            PrintOneDChF(arr, i+1);
            
        }  
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e','f'};
        System.out.print("Reverse One D Character Array:  ");
        PrintOneDCh(arr, 0);
        System.out.println();
        System.out.print("Forward One D Character Array:  ");
        PrintOneDChF(arr, 0);

    }   
}
