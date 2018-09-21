package training.adv.team.GFINet.team5.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -4987669967847498157L;
	
	@Id
	private String employeeId;
	private String position;
	private String password;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
