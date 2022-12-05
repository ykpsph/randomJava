package randomJava.NLayeredApp.business;

import randomJava.NLayeredApp.dataAccess.CategoryDAO.CategoryDAO;
import randomJava.NLayeredApp.entities.Category;

import java.util.List;

public class CategoryManager {
    List<Category> categories;
    CategoryDAO categoryDAO;

    public CategoryManager(List<Category> categories, CategoryDAO categoryDAO) {
        this.categories = categories;
        this.categoryDAO = categoryDAO;
    }



    public void create(Category category) throws Exception {
        for(Category newCategory : categories) {
            if(newCategory.getName().equals(category.getName())){
                throw new Exception("A category with this name already exists."+category.getName());
            }
        }
        categories.add(category);
        categoryDAO.create(category);

        System.out.println("Create category: " + category.getId() + " " + category.getName()+"\n--");
    }
}
