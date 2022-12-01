package binarySearch04Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99};
        Arrays.sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));

        System.out.println("Enter value to search: ");
        int searchElement = sc.nextInt();

        int index = binarySearch(arr, 0, arr.length-1, searchElement);

        if(index != -1) {
            System.out.println("Searched element: " + arr[index] + " found at index: " + index);
        }
        else {
            System.out.println("Searched element: " + arr[index] + " not found in the array.");
        }
    }

    private static int binarySearch(int[] arr, int start, int end, int searchElement) {
        if(start > end) {
            return -1;
        }
        int middle = (start+end) / 2;
        System.out.println("start: " + start + " end: " + end + " middle: " + middle);
        if(searchElement == arr[middle]) {
            return middle;
        }
        else if (searchElement < arr[middle]) {
            return binarySearch(arr, start, middle-1, searchElement);
        }
        else {
            return binarySearch(arr, middle+1, end, searchElement);
        }
    }
}
