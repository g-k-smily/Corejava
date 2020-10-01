
import java.util.Scanner;

public class FindFactorial {
	static int factorial(int number) {
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int number = sc.nextInt();
		System.out.println("The factorial of "+number+" "+"is :"+factorial(number));
	}
}
