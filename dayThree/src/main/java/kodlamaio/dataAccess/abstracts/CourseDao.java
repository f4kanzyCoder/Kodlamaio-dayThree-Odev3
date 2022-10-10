package kodlamaio.dataAccess.abstracts;


import kodlamaio.entities.Course;

public interface CourseDao {
    void add(Course course)throws Exception;

    void update(Course course);

    void delete(Course course);
}
