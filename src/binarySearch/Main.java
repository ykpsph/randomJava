package binarySearch;

public class Main {
     public static void main (String[] args) {

     }

     public static int binarySearch(int[] array, int filledElements, int value){
          int mid;
          int midValue;
          int low = 0;
          int high = filledElements - 1;

          while(low <= high) {
               mid = (low + high) / 2;
               midValue = array[mid];
               if(value == midValue)  {
                    return mid;
               }
               else if (value < midValue) {
                    high = mid - 1;
               }
               else {
                    low = mid + 1;
               }
          }
          return -1;
     }
}
