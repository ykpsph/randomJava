package LinearSearch01;

import java.util.Scanner;


/*******************
 *
 * Iterative program
 *
 *******************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {32, 42, 12, 53, 90, 34, 54};

        System.out.println("Enter value to search: ");
        int value = sc.nextInt();

        int index = linearSearch(arr, value);

        if(index != -1) {
            System.out.println("value searched for: " + value + " found at: " + index);
        } else {
            System.out.println("value searched for: " + value + " not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(value == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
