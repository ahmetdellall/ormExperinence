package orm.ex.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FilmCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FilmCategoryPk filmCategoryId;

	// bi-directional many-to-one association to Category
	@ManyToOne
	@MapsId("categoryId") // add FilmCategoryPK's categoryId property
	@JoinColumn(name = "category_id")
	private Category category;

	// bi-directional many-to-one association to Film
	@ManyToOne
	@MapsId("filmId") // add FilmCategoryPK's filmId property
	@JoinColumn(name = "film_id")
	private Film film;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
