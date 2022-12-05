/**
 * Change elements in the ArrayList
 */

package ArrayList004;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("four");
        numbers.add("six");

        System.out.println(numbers);

        numbers.set(2, "three");

        System.out.println(numbers);

        numbers.add(3, "four");
        numbers.add(4, "five");

        System.out.println(numbers);
    }
}
