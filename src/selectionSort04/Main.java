package selectionSort04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 21, 6, 3, 19, 20};
        System.out.println("Elements in the array before sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Elements in the array after sorting: " + Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int MIN = i; // set the first position as minimum
            System.out.println("Sorting based on number: " + (i+1));

            //find the smalles element by comparing with the element MIN position
            for(int j = i+1; j < arr.length; j++ ){
                System.out.println("Comparing " + arr[MIN] + " and " + arr[j]);
                if(arr[j] < arr[MIN]) {
                    System.out.println(arr[MIN] + " is greater than " + arr[j]);
                    MIN = j;
                }
            }
            // swap the smallest element with element in MIN position
            int temp = arr[i];
            arr[i] = arr[MIN];
            arr[MIN] = temp;
        }
    }
}
