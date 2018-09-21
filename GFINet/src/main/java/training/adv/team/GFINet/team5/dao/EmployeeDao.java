package training.adv.team.GFINet.team5.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import training.adv.team.GFINet.team5.model.Employee;

//@Mapper
@Repository
public interface EmployeeDao extends CrudRepository<Employee, String>{
	
	public String getPasswordByEmployeeId(String employeeId);

}
