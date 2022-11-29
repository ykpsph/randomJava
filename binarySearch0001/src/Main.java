import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 23, 10, 35, 55, 4, 68, 3, 73, 99};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

        System.out.print("Enter value to search: ");
        int searchThis = sc.nextInt();

        int index = binarySearch(arr, 0, arr.length-1, searchThis);

        if(index >= 0) {
            System.out.println("found at: " + index);
        } else {
            System.out.println("not found");
        }


    }



    public static int binarySearch(int[] arr, int start, int end, int searchThis) {

        while(start <= end) {
            int middle = (start+end) / 2;
            if(searchThis == arr[middle]){
                return middle;
            } else if(searchThis < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

            System.out.println("start- "+start+" end " + end + " middle-" + middle);
        }


        return -1;
    }



}