package data;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Facility;
import model.Member;
import util.PersistenceManager;

public class MemberDAOImpl {
	
	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

	public ArrayList<Member> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Member");
		ArrayList<Member> result = (ArrayList<Member>) query.getResultList();
		return result;
	}

	public Member findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Member.class, id);
	}
	
	public int createMeber(Member m) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		return 0;
	}
	
	public int updateMember(Member m) {
		// TODO Auto-generated method stub
		Member updatedMember = em.find(Member.class, m.getId());
		em.getTransaction().begin();
		updatedMember.setSurname(m.getSurname());
		updatedMember.setFirstName(m.getFirstName());
		updatedMember.setSecondName(m.getSecondName());
		em.getTransaction().commit();
		return 0;
	}
	
	public int removeMember(String id) {
		// TODO Auto-generated method stub
		  em.getTransaction().begin();
		  em.remove(em.find(Member.class, id));
		  em.getTransaction().commit();
		return 0;
	}
}
