package esprit.pidev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Basket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String NameBasket;

	// @ManyToOne
	// @JoinColumn(name = "idCommandeClient")
	// private Order order;

	@JsonIgnore
	@OneToMany(mappedBy = "basket")
	private List<CommandLine> CommandLines;

	public Basket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Basket(int id, String nameBasket, List<CommandLine> commandLines) {
		super();
		this.id = id;
		NameBasket = nameBasket;
		CommandLines = commandLines;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameBasket() {
		return NameBasket;
	}

	public void setNameBasket(String nameBasket) {
		NameBasket = nameBasket;
	}

	public List<CommandLine> getCommandLines() {
		return CommandLines;
	}

	public void setCommandLines(List<CommandLine> commandLines) {
		CommandLines = commandLines;
	}

}
