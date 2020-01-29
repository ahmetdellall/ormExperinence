package orm.ex.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import om.ex.jpaqueries.JpaQueries;
import orm.ex.jpafactory.JpaFactory;
import orm.ex.jpafactory.impl.JpaFactoryImpl;
import orm.ex.model.Country;
import orm.ex.repository.DbCountryRepository;

public class DbCountryRepositoryImpl implements DbCountryRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();
	private EntityManager entityManager = jpaFactory.getEntityManager();
	private EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

	@Override
	public Country addACountry(Country country) {
		entityTransaction.begin();
		entityManager.persist(country);
		entityTransaction.commit();
		return country;
	}
	
	@Override
	public List<Object[]> getCountriesId(List<String> countryNames) {
		
		Query query = this.entityManager.createQuery(JpaQueries.getCountryIds);
		
		query.setParameter("names",countryNames);
		
		return query.getResultList();
	}

}
