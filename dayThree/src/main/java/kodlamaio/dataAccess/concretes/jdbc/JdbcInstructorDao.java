package kodlamaio.dataAccess.concretes.jdbc;

import kodlamaio.dataAccess.abstracts.InstructorDao;
import kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added from JDBC database");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Updated from JDBC database");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Deleted from JDBC database");
    }
}
