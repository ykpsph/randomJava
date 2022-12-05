package randomJava.NLayeredApp.business;

import randomJava.NLayeredApp.dataAccess.InstructorDAO.InstructorDAO;
import randomJava.NLayeredApp.entities.Course;
import randomJava.NLayeredApp.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors;
    private InstructorDAO instructorDAO;

    public InstructorManager() {

    }


    public InstructorManager(List<Instructor> instructors, InstructorDAO instructorDAO) {
        this.instructors = instructors;
        this.instructorDAO = instructorDAO;
    }

    public void create(Instructor instructor) throws Exception {
        if(instructor.getFirstName().equals(instructor.getLastName())) {
            throw new Exception("Firstname and lastname can't be the same." + instructor.getFirstName() + " " + instructor.getLastName());
        }
        instructors.add(instructor);
        instructorDAO.create(instructor);

        System.out.println("Create instructor: " + instructor.getFirstName() + " " + instructor.getLastName()+"\n--");
    }
}
