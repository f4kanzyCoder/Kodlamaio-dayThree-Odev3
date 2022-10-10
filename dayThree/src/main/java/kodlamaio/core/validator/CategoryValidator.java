package kodlamaio.core.validator;

import kodlamaio.entities.Category;

import java.util.List;

public class CategoryValidator {
    public static boolean isCategoryNameUnique(List<Category>categories, Category category)throws Exception{
        for (Category c:categories){
            if (c.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Kategori ismi mevcut");

            }
            return true;
        }
        return false;
    }
}
