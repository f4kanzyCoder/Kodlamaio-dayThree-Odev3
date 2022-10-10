package kodlamaio.dataAccess.concretes.hibernate;

import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entities.BaseEntity;
import kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
        public void add(Category category) {
            System.out.println("Added from Hibernate database");
        }

        @Override
        public void update(Category category) {
            System.out.println("Updated from Hibernate database");
        }

        @Override
        public void delete(Category category) {
            System.out.println("Deleted from Hibernate database");
        }

}
