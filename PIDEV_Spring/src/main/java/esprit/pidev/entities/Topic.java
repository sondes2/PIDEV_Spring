package esprit.pidev.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
// @Table(name = "topic")
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTopic;

	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;

	@Column(name = "creationDate")
	private LocalDateTime creationDate;

	@OneToMany(mappedBy = "topic")
	private List<Comment> comments;

	@ManyToOne
	@JoinColumn(name = "iduser")
	private User user;

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(int idTopic, String title, String content, LocalDateTime creationDate, List<Comment> comments,
			User user) {
		super();
		this.idTopic = idTopic;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
		this.comments = comments;
		this.user = user;
	}

	public int getIdTopic() {
		return idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Topic [idTopic=" + idTopic + ", title=" + title + ", content=" + content + ", creationDate="
				+ creationDate + ", comments=" + comments + ", user=" + user + "]";
	}

}
