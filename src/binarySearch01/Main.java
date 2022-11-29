package binarySearch01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {90, 21, 33, 41, 89, 23, 93, 18, 26, 82, 77};
                  // 0   1   2   3   4   5   6   7   8   9   10
                 // [18, 21, 23, 26, 33, 41, 77, 82, 89, 90, 93]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter value to search: ");
        int searchThis = sc.nextInt();

        int index = findNumber(arr, searchThis, 0, arr.length-1);

        if(index >= 0){
            System.out.println("Found at index: "+ index);
        } else {
            System.out.println("Not found");
        }

    }

    public static int findNumber(int[] arr, int searchThis, int start, int end) {

        while(start <= end) {
            int middle = (start+end) / 2;
            if(arr[middle] == searchThis) {
                return middle;
            } else if(arr[middle] < searchThis) {
                start = middle + 1; // move to right half
            } else {
                end = middle - 1; // move to left half
            }
        }

        return -1;
    }
}
