package esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.pidev.entities.Basket;
import esprit.pidev.entities.CommandLine;
import esprit.pidev.entities.CommandLineId;
import esprit.pidev.entities.Product;
import esprit.pidev.repositories.BasketRepository;
import esprit.pidev.repositories.CommandLineRepository;
import esprit.pidev.repositories.ProductRepository;

@Service
public class BasketService {
	@Autowired
	BasketRepository basketrepos;

	@Autowired
	ProductRepository productrepos;

	@Autowired
	CommandLineRepository commandelinerepos;

	public void putProductInBasket(int basketid, int productid) {

		Basket basketManagedEntity = basketrepos.findById(basketid).get();

		Product productManagedEntity = productrepos.findById(productid).get();

		CommandLineId commandelineid = new CommandLineId();

		commandelineid.setIdPanier(basketid);
		commandelineid.setIdProduit(productid);

		CommandLine cl = new CommandLine();
		cl.setCommandeLineId(commandelineid);
		cl.setType("hhhhh");
		int a = basketrepos.count(basketid);
		cl.setTotalprice(productManagedEntity.getPriceProduct() * a);
		cl.setBasket(basketManagedEntity);
		cl.setProduit(productManagedEntity);

		commandelinerepos.save(cl);

	}

	public List<Product> showBasketProducts(int idbasket) {

		return commandelinerepos.getalll(idbasket);

	}

	public void deleteProductInBasket(int idbasket, int productid) {
		basketrepos.findById(idbasket).get();

		basketrepos.supprimer(idbasket, productid);
	}

	public int countbasketproduct(int idbasket) {
		return basketrepos.count(idbasket);
	}

	public int calculateBasketPrice(int idbasket) {
		return basketrepos.calculateBasketPrice(idbasket);
	}

}
