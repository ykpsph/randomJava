package randomJava.NLayeredApp.dataAccess.InstructorDAO;

import randomJava.NLayeredApp.entities.Instructor;

public class jdbcInstructorDAO implements InstructorDAO{
    @Override
    public void create(Instructor instructor) {
        System.out.print("Saved to DB via JDBC: Instructor.");
    }
}
