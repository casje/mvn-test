package br.com.orbenet.product.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.orbenet.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer, Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {		
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		products.replace(product.getId(), product);
	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}

	@Override
	public void delete(Product product) {	
		delete(product.getId());
	}

	@Override
	public Map<Integer, Product> list() {
		return products;
	}

}
