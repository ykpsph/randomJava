package randomJava.NLayeredApp.dataAccess.CategoryDAO;

import randomJava.NLayeredApp.entities.Category;

public class jdbcCategoryDAO implements CategoryDAO{
    @Override
    public void create(Category category) {
        System.out.println("Saved to DB via JDBC: Category.");
    }
}
