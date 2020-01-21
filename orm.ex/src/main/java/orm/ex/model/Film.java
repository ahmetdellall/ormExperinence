package orm.ex.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Film {

	private enum Rating {
		G, PG, PG_10, R, NC_17
	}

	private int filmId;
	private String title;
	private String desc;
	private int releaseYear;
	private Language language;
	private Language languageOriginialLanguage;
	private int rentalDuration;
	private double rentalRate;
	private int lenght;
	private double replacementCost;
	private Rating rating;
	private Set<String> speacialFeature = new HashSet<String>();
	private Timestamp timestampFilm;

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Language getLanguageOriginialLanguage() {
		return languageOriginialLanguage;
	}

	public void setLanguageOriginialLanguage(Language languageOriginialLanguage) {
		this.languageOriginialLanguage = languageOriginialLanguage;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Set<String> getSpeacialFeature() {
		return speacialFeature;
	}

	public void setSpeacialFeature(Set<String> speacialFeature) {
		this.speacialFeature = speacialFeature;
	}

	public Timestamp getTimestampFilm() {
		return timestampFilm;
	}

	public void setTimestampFilm(Timestamp timestampFilm) {
		this.timestampFilm = timestampFilm;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", desc=" + desc + ", releaseYear=" + releaseYear
				+ ", language=" + language + ", languageOriginialLanguage=" + languageOriginialLanguage
				+ ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate + ", lenght=" + lenght
				+ ", replacementCost=" + replacementCost + ", rating=" + rating + ", speacialFeature=" + speacialFeature
				+ ", timestampFilm=" + timestampFilm + "]";
	}

}
