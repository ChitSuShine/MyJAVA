package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Facility;

public interface FacilityDAO {

	public ArrayList<Facility> findAll();
	public Facility findById(String id);
	public int createFacility(Facility f) throws ClassNotFoundException, SQLException;
	public int updateFacility(Facility f);
	public int removeFacility(String id);
}
