package orm.ex.jpafactory;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

public interface JpaFactory {

	EntityManager getEntityManager();

	EntityTransaction getEntityTransaction();
}
