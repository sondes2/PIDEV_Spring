package esprit.pidev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Command implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date dateComm;

	private String etatcommande;

	private float montant;

	@OneToOne
	private CommandLine cmdline;

	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Command(int id, Date dateComm, String etatcommande, float montant, CommandLine cmdline) {
		super();
		this.id = id;
		this.dateComm = dateComm;
		this.etatcommande = etatcommande;
		this.montant = montant;
		this.cmdline = cmdline;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Date getDateComm() {
		return dateComm;
	}

	public void setDateComm(Date dateComm) {
		this.dateComm = dateComm;
	}

	public String getEtatcommande() {
		return etatcommande;
	}

	public void setEtatcommande(String etatcommande) {
		this.etatcommande = etatcommande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommandLine getCmdline() {
		return cmdline;
	}

	public void setCmdline(CommandLine cmdline) {
		this.cmdline = cmdline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
