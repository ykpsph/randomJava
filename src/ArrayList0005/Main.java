/**
 * In order to remove an element from an ArrayList, we can use the remove() method.
 */

package ArrayList0005;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(32);
        arrayList.add(2);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
