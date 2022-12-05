/**
 * Sorting an ArrayList using sort() method.
 */

package ArrayList007;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(8);
        numbers.add(6);
        numbers.add(9);
        numbers.add(4);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
