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
//		//Bir fabrika olu�turarak olu�turaca��m�z nesneye, persistance static s�n�f ile persistance.xml icersinde tan�mlad���m�z example-jpa unit'e eri�ebiliyoruz.
//		
//		EntityManager entityManager =entityManagerFactory.createEntityManager();
//		//entityManager interface'i bizim sorgular �zerinde i�lem yapmam�z� sa�layacak, create, update, delete gibi db i�lemlerini ger�ekle�tirebilece�iz.
//
//		//EntityTransaction entityTransaction = entityManager.getTransaction();
//		//bir i�lemin ba�ar�l� olup olmamas� durumu kontrol etmemizi sa�l�yor.Hata durumunda rollback yaparak i�lemi geri almam�z� sa�l�yor.

		

		DbCountryRepository dbCountryRepository = new DbCountryRepositoryImpl();

		List<String> names= Arrays.asList("Afghanistan","Bangladesh","China");
		
		List<Object[]> list =dbCountryRepository.getCountriesId(names);
		
		for (Object[] objects : list) {
			System.out.println(objects[0]);
		}
		}

	}


