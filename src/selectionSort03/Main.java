package selectionSort03;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] numArray = {47, 85, 62, 34, 7, 10, 50};
        int[] sortedArray = selectionSort(numArray);

        //System.out.println("Sorted array is: " + Arrays.toString(numArray));
        System.out.println("-------------------");
        for(int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
    private static int[] selectionSort(int[] numArray) {
        int lowest;
        for(int i = 0; i < numArray.length-1; i++){
            lowest = i;
            for(int j = i+1; j < numArray.length; j++){
                if(numArray[j] < numArray[lowest]){
                    lowest = j;
                }
            }
            swapElements(i, lowest, numArray);
        }
        return numArray;
    }
    private static void swapElements(int index, int lowest, int[] numArray) {
        int temp = numArray[index];
        numArray[index] = numArray[lowest];
        numArray[lowest] = temp;

        for(int num : numArray) {
            System.out.print(num+" ");
        }
        System.out.println("");
    }
}
