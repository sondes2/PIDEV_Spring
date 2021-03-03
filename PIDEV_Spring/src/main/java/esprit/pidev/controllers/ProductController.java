package esprit.pidev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import esprit.pidev.entities.Product;
import esprit.pidev.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService PS;

	@GetMapping("/showproducts")
	@ResponseBody
	public List<Product> showproducts() {

		return (List<Product>) PS.showproducts();

	}
}
