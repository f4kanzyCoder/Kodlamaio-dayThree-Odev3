package kodlamaio.dataAccess.abstracts;

import kodlamaio.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(Instructor instructor);
}
