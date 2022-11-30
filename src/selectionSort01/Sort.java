package selectionSort01;

public class Sort {
    public static void sort(int[] list) {
        int m; // index of the smallest value

        for(int i = 0; i < list.length; i++) {
            m = indexOfNextSmallest(list, i);
        }
    } // end sort

    public static int indexOfNextSmallest(int[] list, int startIndex) {
        int minIndex = startIndex;

        for(int i = 0; i < list.length; i++) {
            if(list[i] < list[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    } // end indexOfNextSmallest

    private static void swap(int[] list, int i, int j) {
        int temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    } // end swap

} // end Sort


/**
 * overview of the selection sort algorithm
 * Let's examine how people tend to sort cards when playing a card game.
 * Assume you want to sort in ascending order with the smallest cards going at the left.
 * You search for and select the smallest card and move it to the leftmost position.
 * The left side is where you keep the cards that have been sorted already.
 * You then search for the next smallest card, but in doing so, you look only at cards
 * that are in the unsorted portion of the card group. You move the found card to the second
 * position on the left side of the card group. You repeat this search-and-move process until
 * there are no more cards in the unsorted portion of the card group.
 */