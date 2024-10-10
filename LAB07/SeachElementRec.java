package LAB07;

import java.util.Random;
import java.util.Scanner;

public class SeachElementRec {
    public static int IterativeSearch(int arr[],int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            return 1;
        }
        return 0;
    }
    public static int RecursiveSearch(int arr[],int num,int index)
    {
        if(index>=arr.length)
        return 0;
        else if(arr[index]==num)
        return 1;
        return RecursiveSearch(arr, num, index+1);
        
    }
    public static void main(String[] args) {
        int arr[]=new int[10];

        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        System.out.print(" Enter Number To Search:");
        int n=scan.nextInt();
        
        int index=0;
        System.out.print("Random Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Recursive:"+RecursiveSearch(arr, n, index)); 
        System.out.println("Iterative:"+IterativeSearch(arr, n));
        

    }


    
}