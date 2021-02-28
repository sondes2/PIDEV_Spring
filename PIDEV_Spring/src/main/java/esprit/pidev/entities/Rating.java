package esprit.pidev.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRating;

	@OneToOne
	private Comment comment;

	@ManyToOne
	private User user;

	@Column(nullable = false)
	private Long points;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(int idRating, Comment comment, User user, Long points) {
		super();
		this.idRating = idRating;
		this.comment = comment;
		this.user = user;
		this.points = points;
	}

	public int getIdRating() {
		return idRating;
	}

	public void setIdRating(int idRating) {
		this.idRating = idRating;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Rating [idRating=" + idRating + ", comment=" + comment + ", user=" + user + ", points=" + points + "]";
	}

}
