package kodlamaio;

import kodlamaio.business.concretes.CategoryManager;
import kodlamaio.business.concretes.CourseManager;
import kodlamaio.core.logging.abstracts.Logger;
import kodlamaio.core.logging.concretes.DatabaseLogger;
import kodlamaio.dataAccess.concretes.hibernate.HibernateCategoryDao;
import kodlamaio.dataAccess.concretes.jdbc.JdbcCourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category category =new Category(1,"Programlama");
        Category category2 =new Category(2,"Programlama");
        Instructor egitmen1= new Instructor(1,"Engin Demirog");
        System.out.println(egitmen1.getName());
        Course kurs = new Course(1,"Java",-5,"Ücretli");
        Course kur2 = new Course(2,"Java",10,"Ücretli");
        System.out.println(kurs.getCourseName());
       // Category category2 =new Category(2,"Programlamaz");
        List<Category>categories=new ArrayList<>();
        List<Logger>loggers=new ArrayList<>();
        List<Course>courses=new ArrayList<>();
        loggers.add(new DatabaseLogger());


//        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers,categories);
//        try {
//            categoryManager.add(category);
//            categoryManager.add(category2);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers,courses);
        try {
            courseManager.add(kurs);
            courseManager.add(kur2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
