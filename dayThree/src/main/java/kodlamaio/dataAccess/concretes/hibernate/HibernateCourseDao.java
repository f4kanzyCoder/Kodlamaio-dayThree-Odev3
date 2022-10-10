package kodlamaio.dataAccess.concretes.hibernate;

import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Added from Hibernate database");
    }

    @Override
    public void update(Course course) {
        System.out.println("Updated from Hibernate database");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Deleted from Hibernate database");
    }
}
