package kodlamaio.dataAccess.abstracts;

import kodlamaio.entities.BaseEntity;
import kodlamaio.entities.Category;

public interface CategoryDao {

    void add(Category category)throws Exception;
    void update(Category category);
    void delete(Category category);
}
