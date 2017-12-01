package career.projectcollectionbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import career.projectcollectionbackend.dao.ProductDAO;
import career.projectcollectionbackend.dto.Product;
@Transactional
@Repository("productDAO")

public class ProductDAOimpl implements ProductDAO{
@Autowired
SessionFactory sessionFactory;
	public Product get(int productId) {
		try 
		{
			return sessionFactory.getCurrentSession()
					.get(Product.class, Integer.valueOf(productId));
		} 
		catch (Exception e) 
		{
			return null;
		}
		
	}

	public List<Product> list() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM Product",Product.class)
					.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	/*Insert data into table*/
	
	

	public boolean add(Product product) {
		try {
			
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
			
		}
	}

	/*To update the table product*/
	
	public boolean update(Product product) {
		try
		{sessionFactory.getCurrentSession().update(product);
		return true;}
		catch (Exception e) {
			return false;
		}
	}

	/*To Delete the table product*/
	
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			return this.update(product);
		} catch (Exception e) {
			return false;
		}
	}

	public List<Product> listActiveProducts() {
String selectActiveProduct="FROM Product WHERE active=:active";

        return sessionFactory.getCurrentSession()
		.createQuery(selectActiveProduct,Product.class)
		.setParameter("active", true).getResultList();
	}

	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveProductByCategory="FROM Product WHERE active=:active AND categoryId=:categoryId";
	
		return sessionFactory.getCurrentSession()
				.createQuery(selectActiveProductByCategory,Product.class)
				.setParameter("active", true)
				.setParameter("categoryID", categoryId)
				.getResultList();
	}

	public List<Product> getLatestActiveProducts(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Product WHERE active=:active ORDER BY id",Product.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

}
