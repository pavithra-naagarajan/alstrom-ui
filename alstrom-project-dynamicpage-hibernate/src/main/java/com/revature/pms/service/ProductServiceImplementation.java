package com.revature.pms.service;

import java.util.List;

import com.revature.pms.dao.ProductDAO;
import com.revature.pms.dao.ProductDAOImpl;
import com.revature.pms.model.Product;

public class ProductServiceImplementation implements ProductService {
	ProductDAO productDAO = new ProductDAOImpl();

	public boolean addProduct(Product product) {

		if (product.getPrice() < 0)
			return false;

		else
			return productDAO.addProduct(product);

	}

	public boolean deleteProduct(int productId) {
		return productDAO.deleteProduct(productId);
	}

	public boolean updateProduct(Product product) {
		
		return productDAO.updateProduct(product);
		}

	public Product getProductById(int productId) {

		return productDAO.getProductById(productId);
	}

	public List<Product> getProductByName(String productName) {

		return productDAO.getProductByName(productName);
	}

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	public boolean isProductExists(int productId) {
		return productDAO.isProductExists(productId);
	}

}
