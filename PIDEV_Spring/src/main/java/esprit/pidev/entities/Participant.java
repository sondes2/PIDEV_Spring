package esprit.pidev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.minidev.json.annotate.JsonIgnore;

//@Entity
public class Participant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6191889143079517027L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String FirstName;

	private String Lastname;
	private String Email;
	private Long PhoneNumber;
	// @JsonBackReference
	@JsonIgnore
	@ManyToMany(mappedBy = "participants", fetch = FetchType.EAGER)
	// @NotNull
	private List<Donations> donations;

	public List<Donations> getDonations() {
		return donations;
	}

	public void setDonations(List<Donations> donations) {
		this.donations = donations;
	}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Participant(Long id, String firstName, String lastname, String email, Long phoneNumber,
			List<Donations> donations) {
		super();
		this.id = id;
		FirstName = firstName;
		Lastname = lastname;
		Email = email;
		PhoneNumber = phoneNumber;
		this.donations = donations;
	}

}
