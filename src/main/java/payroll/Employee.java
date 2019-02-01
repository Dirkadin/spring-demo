package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data //Lombok annotation.  Creates all getters, setters, equals, hash, and toString
@Entity //JPA annotation.  Makes object ready to store in JPA-based data store
public class Employee {
	
	private @Id @GeneratedValue Long id; //Key and database generated value
	private String name;
	private String role;
	
	Employee() {
		
	}
	
	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}

}
