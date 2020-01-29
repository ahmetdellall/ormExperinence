package orm.ex.testBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.omg.CORBA.DATA_CONVERSION;

import orm.ex.jpafactory.JpaFactory;
import orm.ex.jpafactory.impl.JpaFactoryImpl;
import orm.ex.model.Actor;
import orm.ex.model.Address;
import orm.ex.model.City;
import orm.ex.model.Country;
import orm.ex.repository.DbActorRepository;
import orm.ex.repository.DbCountryRepository;
import orm.ex.repositoryimpl.DbActorRepositoryImpl;
import orm.ex.repositoryimpl.DbCountryRepositoryImpl;

public class Testable {

	public static void main(String[] args) {

//		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("orm.ex"); 
//		//Bir fabrika oluþturarak oluþturacaðýmýz nesneye, persistance static sýnýf ile persistance.xml icersinde tanýmladýðýmýz example-jpa unit'e eriþebiliyoruz.
//		
//		EntityManager entityManager =entityManagerFactory.createEntityManager();
//		//entityManager interface'i bizim sorgular üzerinde iþlem yapmamýzý saðlayacak, create, update, delete gibi db iþlemlerini gerçekleþtirebileceðiz.
//
//		//EntityTransaction entityTransaction = entityManager.getTransaction();
//		//bir iþlemin baþarýlý olup olmamasý durumu kontrol etmemizi saðlýyor.Hata durumunda rollback yaparak iþlemi geri almamýzý saðlýyor.

		

		DbCountryRepository dbCountryRepository = new DbCountryRepositoryImpl();

		List<String> names= Arrays.asList("Afghanistan","Bangladesh","China");
		
		List<Object[]> list =dbCountryRepository.getCountriesId(names);
		
		for (Object[] objects : list) {
			System.out.println(objects[0]);
		}
		}

	}


