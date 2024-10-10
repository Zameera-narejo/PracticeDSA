package LAB07;

import java.util.Scanner;

public class FactorialR {
    public static int fact(int n)
    {
        if(n==0||n==1)
        return 1;
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter any Positive Number For Calculate Factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n+"! = "+fact(n));
    }
}
