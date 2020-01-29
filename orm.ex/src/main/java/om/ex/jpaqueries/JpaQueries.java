package om.ex.jpaqueries;

public class JpaQueries {

	/*
	 * get all actors
	 * */
	public static final  String getAllActor ="select p from Actor p ";
	
	/* get actor by id  */
	public static final  String getActorById ="select p from Actor p where p.actorId=:actorId ";
	
	/*Display the first and last name of each actor in a single column in upper case letters. Name the column Actor Name. 
	 *isminin ve soy ismin ilk harfi büyük olaarak, actor name adýnda bir col yaparak listeleme
	 * */
	public static final  String getAllActorUpperCase ="select concat(CONCAT(UPPER(SUBSTRING(a.actorName,1,1)),LOWER(SUBSTRING(a.actorName,2))),"
			+ "CONCAT(UPPER(SUBSTRING(a.actorLastName,1,1)),LOWER(SUBSTRING(a.actorLastName,2)))) as ActorName from Actor a";
	
	/*isminde gecen bir karekter satýrýna göre arama, isminde joe geçenleri getir gibi..
	 * You need to find the ID number, first name, and last name of an actor, of whom you know only the first name, "Joe."
	 * */
	public static final String getActorÝsFirstName="select a.actorId , a.actorName , a.actorLastName from Actor a where a.actorName like :actorName group by a.actorId ";

	public static final  String getCountryIds ="select c.countryId from Country c where c.countryName IN :names ";
	
}
