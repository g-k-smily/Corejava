import java.util.Scanner;
public class InsertionSort {
    static int[] takeInputs(int number) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    static int[] insertionSort(int arr[]) {
    	 int n = arr.length;  
         for (int j = 1; j < n; j++) {  
             int key = arr[j];  
             int i = j-1;  
             while ( (i >= 0) && ( arr [i] > key ) ) {  
                 arr [i+1] = arr [i];  
                 i--;  
             }  
             arr[i+1] = key;  
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
        printSortedArray(insertionSort(takeInputs(number)));
    }
}