package com.revature.pms.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.pms.model.Customer;
import com.revature.pms.model.Product;

public class ProductDAOImplTest {
	ProductDAO productDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		productDAO = new ProductDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		productDAO = null;
	}

	@Test
	public void testAddProduct() {
		int productIdToTest = 000;
		List<Product> originalCustomers1 = productDAO.getAllProducts();
		productDAO.addProduct(new Product(productIdToTest, "demoName", 5, 100, "Good"));
		List<Product> originalCustomers2 = productDAO.getAllProducts();

		assertEquals(originalCustomers2.size(), originalCustomers1.size() + 1);

		productDAO.deleteProduct(productIdToTest);

	}


	@Test
	public void testDeleteProduct() {
		int productId = -7777;
		assertEquals(true, productDAO.deleteProduct(productId));

	}

	@Test
	public void testUpdateProduct() {

	}

	@Test
	public void testGetProductById() {
		int productId = 2;
		Product product = productDAO.getProductById(productId);
		assertNotNull(product);
	}

	@Test
	public void testGetProductByName() {
		List<Product> products = productDAO.getProductByName("lakme");
		assertEquals(2, products.size());

	}

	@Test
	public void testGetAllProducts() {
		List<Product> products = productDAO.getAllProducts();
		assertEquals(5, products.size());
	}

	@Test
	public void testIsProductExists() {
		int productId = 2;
		boolean result = productDAO.isProductExists(productId);
		assertEquals(result, true);
	}

}
