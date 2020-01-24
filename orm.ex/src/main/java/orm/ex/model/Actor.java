package orm.ex.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

@Entity // burada bu sýnýfýn bir table olduðunu söylüyoruz
public class Actor {

	@Id // burada bu deðiþkenin bir primary key olduðunu söyüyoruz
	@Column(nullable =false,unique = true, columnDefinition = "SMALLINT"	)
	@Type(type = "org.hibernate.type.ShortType")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actorId;
	
	@Column(nullable = false, length = 45)
	private String actorName;
	
	@NaturalId
	@Column(nullable = false, length = 45)
	private String actorLastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date actorLast_update;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorLastName() {
		return actorLastName;
	}

	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

	public Date getActorLast_update() {
		return actorLast_update;
	}

	public void setActorLast_update(Date actorLast_update) {
		this.actorLast_update = actorLast_update;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorLastName=" + actorLastName
				+ ", actorLast_update=" + actorLast_update + "]";
	}

}
