package Model.database.RingNoCoating;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class RingNoCoatingDao implements RingNoCoatingInterface {
	@PersistenceUnit
	private EntityManagerFactory emFactory;
	RingNoCoatingDao(){}
	
	public void save(RingNoCoatingParameters ringNoCoatingParameters) {
		// TODO Auto-generated method stub
		EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(ringNoCoatingParameters);
        tx.commit();
        entityManager.close();
		
	}

	public RingNoCoatingParameters get(Long id) {
		// TODO Auto-generated method stub
		EntityManager entityManager = emFactory.createEntityManager();
		RingNoCoatingParameters ringNoCoatingParameters = entityManager.find(RingNoCoatingParameters.class, id);
        entityManager.close();
        return ringNoCoatingParameters;
	}

	
	
	
}
