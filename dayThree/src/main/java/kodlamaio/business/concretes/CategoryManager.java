package kodlamaio.business.concretes;

import kodlamaio.core.logging.abstracts.Logger;
import kodlamaio.core.validator.CategoryValidator;
import kodlamaio.dataAccess.abstracts.CategoryDao;

import kodlamaio.entities.Category;

import java.util.List;

public class CategoryManager implements CategoryDao{
    private CategoryDao categoryDao;
    private List<Logger>loggers;
    private List<Category>categories;
    public CategoryManager(){}
    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category)throws Exception{
        CategoryValidator.isCategoryNameUnique(categories,category);
        this.categories.add(category);
        this.categoryDao.add(category);

        categoryDao.add(category);
        for (Logger logger:loggers){
            logger.log(category.getCategoryName());
        }
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}
