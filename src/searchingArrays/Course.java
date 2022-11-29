package searchingArrays;

// This class represents a particular course in a school.

public class Course {
    private String courseName;
    private int[] ids;
    private int filledElements;

    public Course(String courseName, int[] ids, int filledElements){
     this.courseName = courseName; // name of the course
     this.ids = ids;               // IDs for students in the course
     this.filledElements = filledElements; // number of filled-in elements
    }

    public int findStudent(int id){
     for(int i = 0; i < filledElements; i++){
      if(ids[i] == id){
       return i;
      }
     }
     return -1;
    }

}
