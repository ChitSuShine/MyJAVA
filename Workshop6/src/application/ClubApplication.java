package application;

import java.sql.SQLException;

import dao.FacilityDAO;
import data.FacilityDAOImpl;
import data.MemberDAOImpl;
import model.Facility;
import model.Member;

public class ClubApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Members are:"); MemberDAOImpl mdao = new MemberDAOImpl();
		 * for (Member member : mdao.findAll()) { System.out.println(member.toString());
		 * }
		 * 
		 * System.out.println("Facilities are:"); FacilityDAO fdao = new
		 * FacilityDAOImpl(); for (Facility facility : fdao.findAll()) {
		 * System.out.println(facility.toString()); }
		 */

		FacilityDAO fdao = new FacilityDAOImpl();

		// Find Facility by ID
		System.out.println("First facility is " + fdao.findById("1"));

		// Facility f = new Facility("3", "Court", "Tennis");		
		// 0 for Success
		// System.out.println("Insertion: " + fdao.createFacility(f));
		
		// Facility f = new Facility("3", "Large Court", "Basketball");
		// System.out.println("Update: " + fdao.updateFacility(f));
		
		// MemberDAOImpl mdao = new MemberDAOImpl();
		// Member m = new Member("2", "Nan", "Nweni", "Zaw");
		// System.out.println("Update: " + mdao.updateMember(m));
		
		System.out.println("Remove: " + fdao.removeFacility("3"));
	}

}
