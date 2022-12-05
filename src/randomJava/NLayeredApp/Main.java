package randomJava.NLayeredApp;

import randomJava.NLayeredApp.business.CategoryManager;
import randomJava.NLayeredApp.business.CourseManager;
import randomJava.NLayeredApp.business.InstructorManager;
import randomJava.NLayeredApp.dataAccess.CategoryDAO.CategoryDAO;
import randomJava.NLayeredApp.dataAccess.CategoryDAO.jdbcCategoryDAO;
import randomJava.NLayeredApp.dataAccess.CourseDAO.jdbcCourseDAO;
import randomJava.NLayeredApp.dataAccess.InstructorDAO.hibernateInstructorDAO;
import randomJava.NLayeredApp.entities.Category;
import randomJava.NLayeredApp.entities.Course;
import randomJava.NLayeredApp.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Instructor
        Instructor i1 = new Instructor("Jack", "Morrin");
        Instructor i2 = new Instructor("Yakup", "Sipahi");
        Instructor i3 = new Instructor("Engin", "Demirog");

        List<Instructor> instructors = new ArrayList<Instructor>();
        List<Instructor> newInstructors = new ArrayList<Instructor>();
        newInstructors.add(i1);
        newInstructors.add(i2);
        newInstructors.add(i3);

        InstructorManager instructorManager = new InstructorManager(instructors, new hibernateInstructorDAO());
        for(Instructor instructor : newInstructors) {
            instructorManager.create(instructor);
        }
        System.out.println("----------------------------------------");




        // Course
        Course c1 = new Course(1001, "Python  ", 49.90, "Easy", i1.getFirstName());
        Course c2 = new Course(1002, "C++     ", 99.90, "Hard", i2.getFirstName());
        Course c3 = new Course(1003, "Java    ", 19.99, "Medium", i3.getFirstName());


        List<Course> newCourses = new ArrayList<Course>();
        newCourses.add(c1);
        newCourses.add(c2);
        newCourses.add(c3);

        List<Course> courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(courses, new jdbcCourseDAO());
        for(Course course : newCourses) {
            courseManager.create(course);
        }
        System.out.println("----------------------------------------");


        // Category

        Category ca1 = new Category(1, "Bootcamp");
        Category ca2 = new Category(2, "0 to Hero");
        Category ca3 = new Category(3, "Beginner friendly");



        List<Category> newCategories = new ArrayList<Category>();
        newCategories.add(ca1);
        newCategories.add(ca2);
        newCategories.add(ca3);

        List<Category> categories = new ArrayList<Category>();
        CategoryManager categoryManager = new CategoryManager(categories, new jdbcCategoryDAO());
        for(Category category : newCategories) {
            categoryManager.create(category);
        }




    }
}




