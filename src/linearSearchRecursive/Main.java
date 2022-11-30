package linearSearchRecursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12, 23, 10, 34, 55, 4, 68, 3, 73, 99, 14};

        System.out.print("Enter value to search: ");
        int searchElement = sc.nextInt();

        int index = linearSearch(arr, 0, arr.length-1, searchElement);

        if(index != -1) {
            System.out.println("Searched item: " + arr[index] + " found at index: " + index);
        } else {
            System.out.println("Searched item " + searchElement + " not found in the list.");
        }
    }

    public static int linearSearch(int[] arr, int index, int length, int searchElement) {

        if(index > length){
            return -1;
        }
        if(arr[index] == searchElement) {
            return index;
        }
        return linearSearch(arr, index+1, length, searchElement);
    }
}
