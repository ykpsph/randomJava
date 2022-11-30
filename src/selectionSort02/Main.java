package selectionSort02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Before selection sort: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("After selection sort: ");

//        for(int i : arr) {
//            System.out.print(i + " ");
//        }
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j; // searching for the lowest index
                }
            }
            int smallerNumber = arr[index]; // temp
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}

