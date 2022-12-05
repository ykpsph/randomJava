/**
 * Adding elements to an array list.
 *
 * add(Object) this method is used to add an element at the end of the ArrayList
 * add(index, Object) this method is used to add an element at a specific index in the ArrayList
 */

package ArrayList003;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Geeks");
        arrayList.add("Geeks");
        System.out.println(arrayList);

        arrayList.add(1, "for");

        System.out.println(arrayList);
    }
}
