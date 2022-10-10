package kodlamaio.dataAccess.concretes.jdbc;

import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Added from JDBC database");
    }

    @Override
    public void update(Course course) {
        System.out.println("Updated from JDBC database");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Deleted from JDBC database");
    }
}
