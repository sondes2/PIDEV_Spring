package esprit.pidev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private Long Code;
	// @Length(min=3, max=20)
	// @Length(min=3, max=20, message = "Nom trop long ou trop court. Et oui
	// messages sont plus stylés que ceux de Spring")
	@Column(length = 5)
	// @Size(min = 3, max = 5)
	private String NameProduct;
	// @Min(value = 1)
	private Double priceProduct;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "yyyy-MM-dd")
	private Date dateCreation;
	private Double Weight;
	private String Description;
	private String Picture;
	@ManyToOne()

	private Category idCategory;

	public Product() {
		super();

	}

	public Product(Long code, String nameProduct, Double priceProduct, Date dateCreation, Double weight,
			String description, String picture, Category idCategory) {
		super();
		Code = code;
		NameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.dateCreation = dateCreation;
		Weight = weight;
		Description = description;
		Picture = picture;
		this.idCategory = idCategory;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", Code=" + Code + ", NameProduct=" + NameProduct + ", priceProduct="
				+ priceProduct + ", dateCreation=" + dateCreation + ", Weight=" + Weight + ", Description="
				+ Description + ", Picture=" + Picture + ", idCategory=" + idCategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Code == null) ? 0 : Code.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((NameProduct == null) ? 0 : NameProduct.hashCode());
		result = prime * result + ((Picture == null) ? 0 : Picture.hashCode());
		result = prime * result + ((Weight == null) ? 0 : Weight.hashCode());
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((idCategory == null) ? 0 : idCategory.hashCode());
		result = prime * result + ((idProduct == null) ? 0 : idProduct.hashCode());
		result = prime * result + ((priceProduct == null) ? 0 : priceProduct.hashCode());
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
		if (Code == null) {
			if (other.Code != null)
				return false;
		} else if (!Code.equals(other.Code))
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
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (idCategory == null) {
			if (other.idCategory != null)
				return false;
		} else if (!idCategory.equals(other.idCategory))
			return false;
		if (idProduct == null) {
			if (other.idProduct != null)
				return false;
		} else if (!idProduct.equals(other.idProduct))
			return false;
		if (priceProduct == null) {
			if (other.priceProduct != null)
				return false;
		} else if (!priceProduct.equals(other.priceProduct))
			return false;
		return true;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public Long getCode() {
		return Code;
	}

	public void setCode(Long code) {
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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
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

	public String getPicture() {
		return Picture;
	}

	public void setPicture(String picture) {
		Picture = picture;
	}

	public Category getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Category idCategory) {
		this.idCategory = idCategory;
	}

}
