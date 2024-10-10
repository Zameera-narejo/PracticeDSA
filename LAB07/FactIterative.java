package LAB07;
import java.util.Scanner;
public class FactIterative {
    public static void main(String[] args) {
        System.out.print("Enter any Positive Number For Calculate Factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(n+"!= "+fact);
        
    }
    
}
