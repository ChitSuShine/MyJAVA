package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility implements Comparable<Facility> {

	@Id
	private String id;
	private String name;
	private String description;

	public Facility() {

	}

	public Facility(String id, String name) {
		this(id, name, null);
	}

	public Facility(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		String fullName = name;
		if (description != null) {
			fullName += " (" + description + ")";
		}
		return (fullName);
	}

	public void show() {
		System.out.println(this);
	}

	// Added so that Facilities can be sorted alphabetically
	public int compareTo(Facility other) {
		return (getName().compareTo(other.getName()));
	}
}
