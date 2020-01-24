package orm.ex.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmCategoryPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="film_id", insertable=false, updatable=false)
	private int filmId;

	@Column(name="category_id", insertable=false, updatable=false)
	private byte categoryId;

	public FilmCategoryPk() {
	}
	public int getFilmId() {
		return this.filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public byte getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(byte categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FilmCategoryPk)) {
			return false;
		}
		FilmCategoryPk castOther = (FilmCategoryPk)other;
		return 
			(this.filmId == castOther.filmId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.filmId;
		hash = hash * prime + ((int) this.categoryId);
		
		return hash;
	}
}
