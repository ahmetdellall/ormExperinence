package orm.ex.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Film {
	
	private enum Rating{
		G,PG,PG13,R,NC17
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, columnDefinition = "SMALLINT")
	private int film_id;
	
	@Column(nullable = false)
	private String tittle;
	
	@Lob
	@Column(nullable = true)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date release_year ;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "language_id", nullable = false,columnDefinition = "tinyint")
	private Language languageId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "original_language_id ",columnDefinition = "tinyint")
	private Language originalLanguageId ;

	@Column(name = "rental_duration", nullable = false,columnDefinition ="tinyint default 3")
	private int rentalDuration;
	
	@Column(name = "rental_rate",nullable = false,columnDefinition = "DECIMAL(4,2) default 4.99")
	private BigDecimal rentalRate;
	
	@Column(columnDefinition = "smallint")
	private int lenght;
	
	@Column(name = "replacement_cost", nullable = false, columnDefinition = "decimal(5,2) default 19.99")
	private BigDecimal replacementCost;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('G','PG','PG-13','R','NC-17') DEFAULT 'G'")
	private Rating rating;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date lastUpdate;
	
	@Column(name = "speacial_features", columnDefinition = "SET('Trailers','Commentaries','Deleted Scenes','Behind the Scenes') ")
	private String specialFeatures ;
}
