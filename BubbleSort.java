import java.util.Scanner;
public class BubbleSort {
    static int[] takeInputs(int number) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        printSortedArray(bubbleSort(takeInputs(number)));
    }
}