package esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.pidev.entities.Product;
import esprit.pidev.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository PR;

	public List<Product> showproducts() {

		return (List<Product>) PR.findAll();

	}

	public Product GetProductById(int idproduit) {
		return PR.findById(idproduit).get();

	}

	public Product addproduct(Product p) {
		return PR.save(p);
	}

	public void deleteProductById(int idproduit) {
		PR.deleteById(idproduit);
	}

}
