
    
import java.util.Scanner;


public class ArmstrongNumber {
    static int count = 0;


    static void digitOfNumber(int number) {
        while (number != 0) {
            number /= 10;
            count++;
        }
    }


    static String isArmstrongNumber(int number) {
        if (number < 0) {
            return "You enter number is negative";
        } else {
            int temp = number;
            int i, rev = 0;


            while (number > 0) {
                int sum = 1;
                i = number % 10;
                for (int j = 0; j < count; j++) {
                    sum = sum * i;
                }
                rev = rev + sum;
                number = number / 10;
            }
            if (temp == rev) {
                return "Number is Armstrong";
            }
        }
        return "Number is not Armstrong";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong or not");
        int number = sc.nextInt();
        digitOfNumber(number);
        System.out.println(isArmstrongNumber(number));
    }
}
 







