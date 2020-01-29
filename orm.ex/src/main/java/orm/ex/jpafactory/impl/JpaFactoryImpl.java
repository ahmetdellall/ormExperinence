package orm.ex.jpafactory.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import orm.ex.jpafactory.JpaFactory;

public class JpaFactoryImpl implements JpaFactory {

	private EntityManager entityManager = null;

	@Override
	public EntityManager getEntityManager() {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm.ex");

			this.entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {

		EntityTransaction entityTransaction = this.entityManager.getTransaction();
		return entityTransaction;
	}

}
