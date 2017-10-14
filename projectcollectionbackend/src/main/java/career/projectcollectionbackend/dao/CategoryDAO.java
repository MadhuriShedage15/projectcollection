package career.projectcollectionbackend.dao;

import java.util.List;

import career.projectcollectionbackend.dto.Category;

public interface CategoryDAO {
	public Category get(int id);
	public List<Category>list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);

}
