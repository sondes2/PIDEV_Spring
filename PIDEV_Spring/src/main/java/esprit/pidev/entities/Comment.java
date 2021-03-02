package esprit.pidev.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//@Entity
//@Table(name = "Comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdComment;

	@Column(name = "content")
	private String Content;

	@Column(name = "creationDate")
	private LocalDateTime creationDate;

	@Column(name = "numberLikes")
	private int NumberLikes;

	@ManyToOne
	@JoinColumn(name = "idtopic")
	private Topic topic;

	@ManyToOne
	@JoinColumn(name = "iduser")
	private User user;

	@OneToOne(mappedBy = "comment")
	private Rating rating;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int idComment, String content, LocalDateTime creationDate, int numberLikes, Topic topic, User user,
			List<Rating> ratings) {
		super();
		IdComment = idComment;
		Content = content;
		this.creationDate = creationDate;
		NumberLikes = numberLikes;
		this.topic = topic;
		this.user = user;
		this.rating = rating;
	}

	public int getIdComment() {
		return IdComment;
	}

	public void setIdComment(int idComment) {
		IdComment = idComment;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public int getNumberLikes() {
		return NumberLikes;
	}

	public void setNumberLikes(int numberLikes) {
		NumberLikes = numberLikes;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rating getRatings() {
		return rating;
	}

	public void setRatings(Rating rating) {
		this.rating = rating;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Comment [IdComment=" + IdComment + ", Content=" + Content + ", creationDate=" + creationDate
				+ ", NumberLikes=" + NumberLikes + ", topic=" + topic + ", user=" + user + ", ratings=" + rating + "]";
	}

}
