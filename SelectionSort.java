import java.util.Scanner;

public class SelectionSort {
	 static int[] takeInputs(int number) {
	        Scanner sc = new Scanner(System.in);
	        int numbers[] = new int[number];
	        for (int i = 0; i < number; i++) {
	            System.out.print("Enter the " + (i + 1) + " number : ");
	            numbers[i] = sc.nextInt();
	        }
	        return numbers;
	    }
	 
	 
	 static int[] selectionSort(int arr[]) {
    	 int n = arr.length;
    	 for (int i = 0; i < n-1; i++)
         {
             int min_idx = i;
             for (int j = i+1; j < n; j++)
                 if (arr[j] < arr[min_idx])
                     min_idx = j;
             int temp = arr[min_idx];
             arr[min_idx] = arr[i];
             arr[i] = temp;
         }
		return arr; 
	 }
	 
	 
	 static void printSortedArray(int arr[]) {
	        System.out.print("The Sorted Order of your Entry is : ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter total number of numbers : ");
	        int number = sc.nextInt();
	        printSortedArray(selectionSort(takeInputs(number)));
	    }


}
