package esprit.pidev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Advertisement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdvertisement;

	private Date start_date;
	private Date end_date;
	private String target_view_count;
	private String final_view_count;
	private float cost;
	private String picture;
	private String Channel_Type;

	public Advertisement() {
		super();
	}

	public Advertisement(Date start_date, Date end_date, String target_view_count, String final_view_count, float cost,
			String picture, String channel_Type) {
		super();
		this.start_date = start_date;
		this.end_date = end_date;
		this.target_view_count = target_view_count;
		this.final_view_count = final_view_count;
		this.cost = cost;
		this.picture = picture;
		Channel_Type = channel_Type;
	}

	public Long getIdAdvertisement() {
		return idAdvertisement;
	}

	public void setIdAdvertisement(Long idAdvertisement) {
		this.idAdvertisement = idAdvertisement;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getTarget_view_count() {
		return target_view_count;
	}

	public void setTarget_view_count(String target_view_count) {
		this.target_view_count = target_view_count;
	}

	public String getFinal_view_count() {
		return final_view_count;
	}

	public void setFinal_view_count(String final_view_count) {
		this.final_view_count = final_view_count;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getChannel_Type() {
		return Channel_Type;
	}

	public void setChannel_Type(String channel_Type) {
		Channel_Type = channel_Type;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advertisement other = (Advertisement) obj;
		if (Channel_Type == null) {
			if (other.Channel_Type != null)
				return false;
		} else if (!Channel_Type.equals(other.Channel_Type))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (final_view_count == null) {
			if (other.final_view_count != null)
				return false;
		} else if (!final_view_count.equals(other.final_view_count))
			return false;
		if (idAdvertisement == null) {
			if (other.idAdvertisement != null)
				return false;
		} else if (!idAdvertisement.equals(other.idAdvertisement))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (target_view_count == null) {
			if (other.target_view_count != null)
				return false;
		} else if (!target_view_count.equals(other.target_view_count))
			return false;
		return true;
	}

}
