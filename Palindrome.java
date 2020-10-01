
import java.util.Scanner;

public class Palindrome {
	static String isPalindrome(int number) {
		int temp = number;
		int i,rev = 0;
		if(number < 0) {
			return "You enter number is negative";
		}else {
			while(number > 0) {
				i = number % 10;
				rev =rev * 10 + i;
				number = number / 10;
			}
			if( temp == rev) {
				return "Number is palindrome";
			}
		}
		return "Number is not palindrome";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not");
		int number = sc.nextInt();
		System.out.println(isPalindrome(number));
	}
}
