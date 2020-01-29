package orm.ex.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.QueryHint;
import javax.persistence.TypedQuery;

import om.ex.jpaqueries.JpaQueries;
import orm.ex.jpafactory.JpaFactory;
import orm.ex.jpafactory.impl.JpaFactoryImpl;
import orm.ex.model.Actor;
import orm.ex.repository.DbActorRepository;

public class DbActorRepositoryImpl implements DbActorRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();
	private EntityManager entityManager = jpaFactory.getEntityManager();
	private EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

	@Override
	public Actor addActor(Actor actor) {

		entityTransaction.begin();
		entityManager.persist(actor);
		entityTransaction.commit();
		return actor;
	}

	@Override
	public List<Actor> listAllActor() {

//		Query query = entityManager.createNamedQuery(JpaQueries.getAllActor);
//		List<Actor> actors = query.getResultList();

		TypedQuery<Actor> typedQuery = this.entityManager.createQuery(JpaQueries.getAllActor, Actor.class);

		return typedQuery.getResultList();

	}

	@Override
	public Actor getActorById(int actorId) {
		TypedQuery<Actor> query = this.entityManager.createQuery(JpaQueries.getActorById, Actor.class);

		query.setParameter("actorId", actorId);

		return query.getSingleResult();
	}

	@Override
	public List<String> getAllActorUpperCase() {

		TypedQuery<String> query = this.entityManager.createQuery(JpaQueries.getAllActorUpperCase, String.class);

		List<String> actors = query.getResultList();

		return actors;
	}

	@Override
	public List<Object[]> getActorByFirstName(String firstName) {

		Query query = this.entityManager.createQuery(JpaQueries.getActor›sFirstName);

		query.setParameter("actorName","%"+firstName+"%");

		List<Object[]> objects = query.getResultList();
		return objects;
	}

}
