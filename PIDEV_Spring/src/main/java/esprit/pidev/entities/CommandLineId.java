package esprit.pidev.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommandLineId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idPanier;
	private Integer idProduit;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPanier == null) ? 0 : idPanier.hashCode());
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
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
		CommandLineId other = (CommandLineId) obj;
		if (idPanier == null) {
			if (other.idPanier != null)
				return false;
		} else if (!idPanier.equals(other.idPanier))
			return false;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		return true;
	}

	public CommandLineId(Integer idPanier, Integer idProduit) {
		super();
		this.idPanier = idPanier;
		this.idProduit = idProduit;
	}

	public CommandLineId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(Integer idPanier) {
		this.idPanier = idPanier;
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
