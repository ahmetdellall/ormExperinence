package orm.ex.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import orm.ex.jpafactory.JpaFactory;
import orm.ex.jpafactory.impl.JpaFactoryImpl;
import orm.ex.model.City;
import orm.ex.repository.DbCityRepository;

public class DbCityRepositoryImpl implements DbCityRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();
	private EntityManager entityManager = jpaFactory.getEntityManager();
	private EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

	@Override
	public City addACity(City city) {

		entityTransaction.begin();
		entityManager.persist(city);
		entityTransaction.commit();
		return city;
	}

}
