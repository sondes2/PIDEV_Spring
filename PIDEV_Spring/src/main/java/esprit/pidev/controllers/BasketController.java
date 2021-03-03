package esprit.pidev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import esprit.pidev.entities.Basket;
import esprit.pidev.entities.Product;
import esprit.pidev.repositories.BasketRepository;
import esprit.pidev.repositories.CommandRepository;
import esprit.pidev.repositories.ProductRepository;
import esprit.pidev.services.BasketService;

@RestController
@RequestMapping("/basket")

public class BasketController {

	@Autowired
	BasketRepository basketrepos;

	@Autowired
	ProductRepository pr;

	@Autowired
	CommandRepository prrrrr;

	@Autowired
	BasketService bs;

	@PostMapping(value = "/addbasket")
	@ResponseBody
	public Basket AddBasket(@RequestBody Basket b) {
		return bs.AddBasket(b);
	}

	@PostMapping(value = "/affecter/{idbasket}/{idproduct}")
	@ResponseBody
	public void putProductInBasket(@PathVariable("idbasket") int idbasket, @PathVariable("idproduct") int idproduct) {

		bs.putProductInBasket(idbasket, idproduct);
	}

	@GetMapping(value = "/show/{idbasket}")
	@ResponseBody
	public List<Product> showBasketProducts(@PathVariable("idbasket") int idbasket) {
		return bs.showBasketProducts(idbasket);

	}

	@DeleteMapping(value = "/deleteproduct/{idbasket}/{idproduct}")
	@ResponseBody
	public void deleteProductInBasket(@PathVariable("idbasket") int idbasket,
			@PathVariable("idproduct") int idproduct) {
		bs.deleteProductInBasket(idbasket, idproduct);

	}

	@GetMapping(value = "/count/{idbasket}")
	@ResponseBody
	public int countBasketProducts(@PathVariable("idbasket") int idbasket) {
		return bs.countbasketproduct(idbasket);

	}

	@GetMapping(value = "/calculateBasketPrice/{idbasket}")
	@ResponseBody
	public int calculateBasketPrice(@PathVariable("idbasket") int idbasket) {
		return bs.calculateBasketPrice(idbasket);

	}

}
