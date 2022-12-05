
/**
 * the following implementation demonstrates how to create and use an ArrayList without the size mentioned.
 */

package ArrayList002;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // declaring the ArrayList without mentioning it's size.
        ArrayList<Integer> arrayList = new ArrayList<>();

        // appending new elements at the end of the list.
        for(int i = 0; i <= 5; i++ ){
            arrayList.add(i+5);
        }
        System.out.println(arrayList); // [5, 6, 7, 8, 9, 10]

        arrayList.remove(3);
        System.out.println(arrayList); // [5, 6, 7, 9, 10]

    }
}
