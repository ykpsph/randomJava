package binarySearch02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1993, 1996, 1992, 1239, 4421, 2182, 4203, 1238};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.println("Enter value to search: ");
        int n = sc.nextInt();



        int index = findNumber(numbers, n, 0, numbers.length-1);

        if(index >= 0) {
            System.out.println("Searched number: " + n + " found at index: " + index);
        } else {
            System.out.println("Searched number: " + n + " not found.");
        }

    }
    public static int findNumber(int[] numbers, int n, int start, int end) {

        while(start <= end) {
            int middle = (start + end) / 2;
            if(n == numbers[middle]) {
                return middle;
            } else if(n < numbers[middle]){
                end = middle-1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }
}
