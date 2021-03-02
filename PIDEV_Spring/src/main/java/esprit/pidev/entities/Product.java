package esprit.pidev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Code;
	private String NameProduct;
	private Double priceProduct;
	private Double Weight;
	private String Description;
	private int quantity;
	private String Picture;

	@OneToMany(mappedBy = "produit")
	private List<CommandLine> CommandLines;

	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;

	public Product() {
		super();

	}

	public Product(int id, int code, String nameProduct, Double priceProduct, Double weight, String description,
			int quantity, String picture, List<CommandLine> commandLines, Category category) {
		super();
		this.id = id;
		Code = code;
		NameProduct = nameProduct;
		this.priceProduct = priceProduct;
		Weight = weight;
		Description = description;
		this.quantity = quantity;
		Picture = picture;
		CommandLines = commandLines;
		this.category = category;
	}

	public int getIdProduct() {
		return id;
	}

	public void setIdProduct(int idProduct) {
		this.id = idProduct;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameProduct) {
		NameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public List<CommandLine> getCommandLines() {
		return CommandLines;
	}

	public void setCommandLines(List<CommandLine> commandLines) {
		CommandLines = commandLines;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
