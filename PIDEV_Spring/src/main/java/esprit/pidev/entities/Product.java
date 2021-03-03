package esprit.pidev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@ManyToOne(fetch = FetchType.EAGER)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Code;
		result = prime * result + ((CommandLines == null) ? 0 : CommandLines.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((NameProduct == null) ? 0 : NameProduct.hashCode());
		result = prime * result + ((Picture == null) ? 0 : Picture.hashCode());
		result = prime * result + ((Weight == null) ? 0 : Weight.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + id;
		result = prime * result + ((priceProduct == null) ? 0 : priceProduct.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Code != other.Code)
			return false;
		if (CommandLines == null) {
			if (other.CommandLines != null)
				return false;
		} else if (!CommandLines.equals(other.CommandLines))
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (NameProduct == null) {
			if (other.NameProduct != null)
				return false;
		} else if (!NameProduct.equals(other.NameProduct))
			return false;
		if (Picture == null) {
			if (other.Picture != null)
				return false;
		} else if (!Picture.equals(other.Picture))
			return false;
		if (Weight == null) {
			if (other.Weight != null)
				return false;
		} else if (!Weight.equals(other.Weight))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id != other.id)
			return false;
		if (priceProduct == null) {
			if (other.priceProduct != null)
				return false;
		} else if (!priceProduct.equals(other.priceProduct))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

}
