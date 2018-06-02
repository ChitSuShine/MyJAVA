package data;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.FacilityDAO;
import model.Facility;
import util.PersistenceManager;

public class FacilityDAOImpl implements FacilityDAO {

	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	
	@Override
	public ArrayList<Facility> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Facility");
		ArrayList<Facility> result = (ArrayList<Facility>)query.getResultList();
		return result;
	}

	@Override
	public Facility findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Facility.class, id);
	}

	@Override
	public int createFacility(Facility f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		em.close();
		return 0;
	}

	@Override
	public int updateFacility(Facility f) {
		// TODO Auto-generated method stub
		Facility updatedFacility = em.find(Facility.class, f.getId());
		em.getTransaction().begin();
		updatedFacility.setName(f.getName());
		updatedFacility.setDescription(f.getDescription());
		em.getTransaction().commit();
		return 0;
	}

	@Override
	public int removeFacility(String id) {
		// TODO Auto-generated method stub
		  em.getTransaction().begin();
		  em.remove(em.find(Facility.class, id));
		  em.getTransaction().commit();
		return 0;
	}

}
