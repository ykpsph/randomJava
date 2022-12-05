/**
 * the following implementation demonstrates how to create and use an ArrayList with mention it's size.
 */
package ArrayList001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int s = 5; // size of the arrayList
        ArrayList<Integer> arrayList = new ArrayList<>(s);

        // append new elements at the end of the list.
        for(int i = 0; i < s; i++) {
            arrayList.add(i+10);
        }
        System.out.println(arrayList); // [10, 11, 12, 13, 14]

        arrayList.remove(2);

        System.out.println(arrayList); // [10, 11, 13, 14]


        for (Integer integer : arrayList) {
            System.out.print(integer);
        }
        System.out.println("\n");


        int[] numbers = {23, 12, 41, 39, 26, 10};

        for (int x : numbers){
            System.out.print(x+" ");
        }
    }
}
