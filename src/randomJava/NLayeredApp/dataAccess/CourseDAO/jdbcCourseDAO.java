package randomJava.NLayeredApp.dataAccess.CourseDAO;

import randomJava.NLayeredApp.entities.Course;

public class jdbcCourseDAO implements CourseDAO{
    @Override
    public void create(Course course) {
        System.out.println("Saved to DB via JDBC: Course.");
    }
}
