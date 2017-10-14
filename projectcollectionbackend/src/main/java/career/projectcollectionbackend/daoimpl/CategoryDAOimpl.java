package career.projectcollectionbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import career.projectcollectionbackend.dao.CategoryDAO;
import career.projectcollectionbackend.dto.Category;
@Repository
public class CategoryDAOimpl implements CategoryDAO {
	@Autowired
private CategoryDAO categoryDAO;
	
	@Autowired
	SessionFactory sessionFactory;
	public Category get(int id) {
		
		return 
		sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
