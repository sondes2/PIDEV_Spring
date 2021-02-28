package esprit.pidev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SaleDepartment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSale;
	private String SaleName;
	private int capacity;

	private String DepartmentType;

	@ManyToMany()
	private List<Product> products;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DepartmentType == null) ? 0 : DepartmentType.hashCode());
		result = prime * result + ((SaleName == null) ? 0 : SaleName.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((idSale == null) ? 0 : idSale.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		SaleDepartment other = (SaleDepartment) obj;
		if (DepartmentType == null) {
			if (other.DepartmentType != null)
				return false;
		} else if (!DepartmentType.equals(other.DepartmentType))
			return false;
		if (SaleName == null) {
			if (other.SaleName != null)
				return false;
		} else if (!SaleName.equals(other.SaleName))
			return false;
		if (capacity != other.capacity)
			return false;
		if (idSale == null) {
			if (other.idSale != null)
				return false;
		} else if (!idSale.equals(other.idSale))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SaleDepartment [idSale=" + idSale + ", SaleName=" + SaleName + ", capacity=" + capacity
				+ ", DepartmentType=" + DepartmentType + ", products=" + products + "]";
	}

	public SaleDepartment(String saleName, int capacity, String departmentType, List<Product> products) {
		super();
		SaleName = saleName;
		this.capacity = capacity;
		DepartmentType = departmentType;
		this.products = products;
	}

	public SaleDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public String getSaleName() {
		return SaleName;
	}

	public void setSaleName(String saleName) {
		SaleName = saleName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getDepartmentType() {
		return DepartmentType;
	}

	public void setDepartmentType(String departmentType) {
		DepartmentType = departmentType;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
