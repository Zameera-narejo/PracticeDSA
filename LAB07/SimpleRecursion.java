package LAB07;
import java.util.Scanner;
public class SimpleRecursion {
    public static void sort(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            System.err.print(n+"  ");
            sort(n-1);
            System.out.print(n+"  ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number 'n'");
        int n=s.nextInt();
        System.out.println("Desending & Ascending:");
        sort(n);
        
    }
    
}
