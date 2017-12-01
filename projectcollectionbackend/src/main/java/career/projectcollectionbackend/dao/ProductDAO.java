package career.projectcollectionbackend.dao;

import java.util.List;

import career.projectcollectionbackend.dto.Product;

public interface ProductDAO {
	public Product get(int productId);
	public List<Product> list();
	public boolean add(Product product);
	public boolean update(Product product); 
	public boolean delete(Product product);
	public List<Product> listActiveProducts();
	public List<Product> listActiveProductsByCategory(int categoryId);
	public List<Product> getLatestActiveProducts(int count);
}
