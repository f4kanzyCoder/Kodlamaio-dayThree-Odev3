package kodlamaio.dataAccess.concretes.jdbc;

import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Added from JDBC database");
    }

    @Override
    public void update(Category category) {
        System.out.println("Updated from JDBC database");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Deleted from JDBC database");
    }
}
