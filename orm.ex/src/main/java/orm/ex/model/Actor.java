package orm.ex.model;

import java.sql.Timestamp;

public class Actor {

	private int actorId;
	private String actorName;
	private String actorLastName;
	private Timestamp actorLast_update;

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

	public Timestamp getActorLast_update() {
		return actorLast_update;
	}

	public void setActorLast_update(Timestamp actorLast_update) {
		this.actorLast_update = actorLast_update;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorLastName=" + actorLastName
				+ ", actorLast_update=" + actorLast_update + "]";
	}

}
