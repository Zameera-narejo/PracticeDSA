package LAB07;
import java.util.Scanner;

class Fibonacci {

    public static  int fabR(int n){
        if (n==0 || n==1)
        {
        return n;
        } 
        else 
        {
        int na = fabR(n-1) + fabR(n-2);  
        return na;
        }
        }
        
    public static void main(String[] args) {
      System.out.print("Enter any Positive Number For Fabonacci Series:");
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print("Fibonacci Series till " + n + " terms Recursive: ");
      for(int i=0;i<=n;i++)
      {
      System.out.print(fabR(i)+" ");
      }
      System.out.println();
      int firstTerm = 0, secondTerm = 1;
      System.out.print("Fibonacci Series till " + n + " terms Iterative: ");
   
      for (int i = 0; i <= n; ++i) {
        System.out.print(firstTerm + " ");
  
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
      }

    } 
  }

