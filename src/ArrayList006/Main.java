/**
 * iterating an ArrayList using enhanced loop.
 */

package ArrayList006;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(32);
        numbers.add(79);

        for(Integer num : numbers) {
            System.out.print(num+" ");
        }
    }
}
