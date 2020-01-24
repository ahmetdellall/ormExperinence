package orm.ex.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testable {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("orm.ex"); 
		//Bir fabrika olu�turarak olu�turaca��m�z nesneye, persistance static s�n�f ile persistance.xml icersinde tan�mlad���m�z example-jpa unit'e eri�ebiliyoruz.
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		//entityManager interface'i bizim sorgular �zerinde i�lem yapmam�z� sa�layacak, create, update, delete gibi db i�lemlerini ger�ekle�tirebilece�iz.

		//EntityTransaction entityTransaction = entityManager.getTransaction();
		//bir i�lemin ba�ar�l� olup olmamas� durumu kontrol etmemizi sa�l�yor.Hata durumunda rollback yaparak i�lemi geri almam�z� sa�l�yor.
	}

}
