package orm.ex.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testable {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("orm.ex"); 
		//Bir fabrika oluþturarak oluþturacaðýmýz nesneye, persistance static sýnýf ile persistance.xml icersinde tanýmladýðýmýz example-jpa unit'e eriþebiliyoruz.
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		//entityManager interface'i bizim sorgular üzerinde iþlem yapmamýzý saðlayacak, create, update, delete gibi db iþlemlerini gerçekleþtirebileceðiz.

		//EntityTransaction entityTransaction = entityManager.getTransaction();
		//bir iþlemin baþarýlý olup olmamasý durumu kontrol etmemizi saðlýyor.Hata durumunda rollback yaparak iþlemi geri almamýzý saðlýyor.
	}

}
