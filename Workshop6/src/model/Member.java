package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
	@Id
	private String id;
	@Column(name="first_name")
    private String firstName;
	@Column(name="second_name")
    private String secondName;
    private String surname;

    public Member()
    {
    	
    }
    
    public Member (String id, String surname, String firstName, String secondName) {
        this.id = id;
    	this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId()
    {
    	return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString () {
        String fullName = firstName;
        if (secondName != null) {
            fullName += " " + secondName;
        }
        fullName += " " + surname;
        return (fullName);
    }

    public void show () {
        System.out.println (this);
    }
}
