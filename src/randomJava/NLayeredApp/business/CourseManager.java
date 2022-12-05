package randomJava.NLayeredApp.business;

import randomJava.NLayeredApp.dataAccess.CourseDAO.CourseDAO;
import randomJava.NLayeredApp.entities.Course;

import java.util.List;

public class CourseManager {
    private List<Course> courses;
    private CourseDAO courseDAO;

    public CourseManager() {

    }
    public CourseManager(List<Course> courses, CourseDAO courseDAO) {
        this.courses = courses;
        this.courseDAO = courseDAO;
    }

    public void create(Course course) throws Exception {
        if(course.getPrice() < 0) {
            throw new Exception("Price can't be less than $20.");
        }
        // courses listesini gez. c objesinin adi ile bu methoda gonderilen course objesinin adi ayni mi ?
        for(Course c : courses) {
            if(c.getName().equals(course.getName())){
                throw new Exception("There is a course with this name already: " + course.getName());
            }
        }
        courseDAO.create(course);
        courses.add(course);

        System.out.println("Create course: " + course.getId() + " " + course.getName()+"\n--");
    }
}
