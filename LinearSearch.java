

import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String args[]) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter key to search");
		int key = sc.nextInt();

		System.out.println(key + " " + "is found at index :" + linearSearch(arr, key));
	}
}
