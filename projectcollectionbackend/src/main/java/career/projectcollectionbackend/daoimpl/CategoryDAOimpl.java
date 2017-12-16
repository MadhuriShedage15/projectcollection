package career.projectcollectionbackend.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import career.projectcollectionbackend.dao.CategoryDAO;
import career.projectcollectionbackend.dto.Category;
@Repository("categoryDAO")
@Transactional
public class CategoryDAOimpl implements CategoryDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	public Category get(int id) {
		
		return 
		sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	public List<Category> list() {
		String selectHQL="FROM Category where active=:active";
		Query query= sessionFactory.getCurrentSession().createQuery(selectHQL);
	    query.setParameter("active", true);
	    return query.getResultList();
	
	}

	public boolean add(Category category) {
		
		try
		{
		sessionFactory.getCurrentSession().save(category);
		return true;
		}
		catch(Exception e) {
			System.out.println(e);
		return false;
		}
	}

	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
			} catch (Exception e) {
			return false;
			}

	}

	public boolean delete(Category category) {
		category.setActive(false);
		try {
		sessionFactory.getCurrentSession().update(category);
		return true;
		} catch (Exception e) {
		return false;
		}

	}
	

}
