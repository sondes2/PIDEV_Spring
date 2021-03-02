package esprit.pidev.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JackPot implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private float Amount;

	// @ManyToOne
	// private Event event;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JackPot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JackPot [id=" + id + ", Amount=" + Amount + "]";
	}

}
