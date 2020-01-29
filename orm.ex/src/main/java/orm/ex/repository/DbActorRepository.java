package orm.ex.repository;

import java.util.List;

import orm.ex.model.Actor;

public interface DbActorRepository {

	public Actor addActor(Actor actor);

	public List<Actor> listAllActor();

	public Actor getActorById(int actorId);
	
	public List<String> getAllActorUpperCase();
	
	public List<Object[]> getActorByFirstName(String firstName);

}
