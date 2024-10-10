package LAB08;
import java.io.*;

class Palindrome
{
	
	static boolean isPalRec(String str, int s, int e) 
	{
		if (s >= e) 
			return true;

		if (str.charAt(s) != str.charAt(e))
			return false;

		return isPalRec(str, s + 1, e - 1); // Recursive call

	}

	//static boolean isPalindrome(String str)
	//{
	//	int n = str.length();
	//	return isPalRec(str, 0, n - 1); 
	//}

	
	public static void main(String args[])
	{
		String str = "racecar"; 
        int n = str.length();
        System.out.println( isPalRec(str, 0, n - 1));
		//if (isPalindrome(str))
		//	System.out.println("true");
	//	else
	//		System.out.println("false"); 
	}
}
