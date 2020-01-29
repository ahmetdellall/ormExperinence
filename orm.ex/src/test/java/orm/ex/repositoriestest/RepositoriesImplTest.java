package orm.ex.repositoriestest;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import orm.ex.model.Actor;
import orm.ex.repository.DbActorRepository;
import orm.ex.repositoryimpl.DbActorRepositoryImpl;

public class RepositoriesImplTest {

	private DbActorRepository actorRepIns = new DbActorRepositoryImpl();
	

//	@Test
//	public void addActor() {
//
//		Actor actor = new Actor();
//		actor.setActorName("Ahmet");
//		actor.setActorLast_update(new Date());
//		actor.setActorLastName("Dellal");
//
//		assertEquals("......", true, actorRepIns.addActor(actor));
//	}

	@Test
	public void getActorById() {
		int getActor = 10;
		
		Actor actor=actorRepIns.getActorById(getActor);
	
		assertEquals("CHRISTIAN",actor.getActorName() );

	}
	
	@Test
	public void getActorName_First_Letter_UpperCase() {
		
		List<String>strings = actorRepIns.getAllActorUpperCase();
		
		for (String string : strings) {
			
			char ch =string.charAt(0);
			
			assertEquals(true, Character.isUpperCase(ch));
		}
	}
	
	@Test
	public void getActorYouKnowOnlyTheName() {
		String firstName = "adam";
		List<Object[]> objects = actorRepIns.getActorByFirstName(firstName);
		
		for (Object[] objects2 : objects) {
			
			
			assertEquals(firstName.toUpperCase(),objects2[1].toString());
		}
	}
	
	
}
