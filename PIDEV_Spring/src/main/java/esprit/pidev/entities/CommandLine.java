package esprit.pidev.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandLine implements Serializable {

	@EmbeddedId
	private CommandLineId commandeLineId;

	private String type;

	private int totalprice;

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idPanier", referencedColumnName = "id", insertable = false, updatable = false)
	private Basket basket;

	@ManyToOne
	@JoinColumn(name = "idProduit", referencedColumnName = "id", insertable = false, updatable = false)
	private Product produit;

	public CommandLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommandLine(CommandLineId commandeLineId, String type, int totalprice, Basket basket, Product produit) {
		super();
		this.commandeLineId = commandeLineId;
		this.type = type;
		this.totalprice = totalprice;
		this.basket = basket;
		this.produit = produit;
	}

	public CommandLineId getCommandeLineId() {
		return commandeLineId;
	}

	public void setCommandeLineId(CommandLineId commandeLineId) {
		this.commandeLineId = commandeLineId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public Product getProduit() {
		return produit;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
