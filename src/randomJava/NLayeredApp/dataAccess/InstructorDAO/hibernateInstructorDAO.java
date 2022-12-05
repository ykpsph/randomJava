package randomJava.NLayeredApp.dataAccess.InstructorDAO;

import randomJava.NLayeredApp.entities.Instructor;

public class hibernateInstructorDAO implements InstructorDAO{
    @Override
    public void create(Instructor instructor) {
        System.out.println("Saved to DB via Hibernate: Instructor.");
    }
}
