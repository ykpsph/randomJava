package binarySearch03Iterative;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter value to search: ");
        int searchelement = sc.nextInt();

        int index = binarySearch(arr, 0, arr.length-1, searchelement);

        if(index != -1) {
            System.out.println("Searched value: " + searchelement + " found at index: " + index);
        } else {
            System.out.println("Searched value: " + searchelement + " not found in the array.");
        }

    }

    private static int binarySearch(int[] arr, int start, int end, int searchElement) {

        while(start <= end) {
            int middle = (start+end) / 2;
            System.out.println("start: " + start + " end: " + end + " middle: " + middle);

            if(searchElement == arr[middle]) {
                return middle;
            }
            else if (searchElement < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }

        }

        return -1;
    }
}
