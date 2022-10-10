package kodlamaio.business.concretes;

import kodlamaio.core.logging.abstracts.Logger;
import kodlamaio.core.validator.CourseValidator;
import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entities.Course;

import java.util.List;

public class CourseManager implements CourseDao{
    private CourseDao courseDao;
    private List<Logger> loggers;
    private List<Course> courses;



    public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;

    }

    @Override
    public void add(Course course)throws Exception {
        CourseValidator.isCourseNameUnique(courses,course);
        CourseValidator.isPriceLessThanZero(course);
        this.courses.add(course);
        this.courseDao.add(course);

        courseDao.add(course);
        for (Logger logger:loggers){
            logger.log(course.getCourseName());

        }
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {

    }


}
