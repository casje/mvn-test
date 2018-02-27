package br.com.orbenet.product.dao;

import java.util.Map;

import br.com.orbenet.product.dto.Product;

public interface ProductDAO {
	
	void create (Product product);
	
	Product read (int id);
	
	void update (Product product);
	
	void delete (int id);
	
	void delete (Product product);
	
	Map<Integer, Product> list();

}
