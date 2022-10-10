package kodlamaio.core.validator;

import kodlamaio.entities.Course;

import java.util.List;

public class CourseValidator {
    public static void isPriceLessThanZero(Course course)throws Exception{
        if (course.getCoursePrice()<0){
            throw new Exception("Kurs fiyati 0 dan aşağı olamaz.");
        }
    }
    public static void isCourseNameUnique(List<Course>courses,Course course)throws Exception{
        for (Course c:courses){
            if (c.getCourseName().equals(course.getCourseName())){
                throw new Exception("Kurs ismi aynı olamaz.");
            }
        }
    }
}
