import java.util.Scanner;
public class Factors {
	 static String factorsFind(int number)
	{
		 String result ="";
		 
		for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
            	result = result + i + ",";
            }
		}
		return result.substring(0, result.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number to find the factors");
			int number =sc.nextInt();
			System.out.println("The Factors are "+factorsFind(number));
	}
}
