package searchingArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] ids = {1001, 1002, 1099};
        Course course = new Course("CS101", ids, ids.length);
        int id;
        int index;

        System.out.println("Enter 4-digit ID: ");
        id = input.nextInt();
        index = course.findStudent(id);
        if(index >= 0){
            System.out.println("found at index " + index);
        } else {
            System.out.println("not found");
        }
    }
}
