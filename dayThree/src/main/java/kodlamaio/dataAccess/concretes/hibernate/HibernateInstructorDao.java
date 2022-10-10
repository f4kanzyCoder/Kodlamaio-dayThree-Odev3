package kodlamaio.dataAccess.concretes.hibernate;

import kodlamaio.dataAccess.abstracts.InstructorDao;
import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added from Hibernate database");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Updated from Hibernate database");

    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Deleted from Hibernate database");
    }
}
