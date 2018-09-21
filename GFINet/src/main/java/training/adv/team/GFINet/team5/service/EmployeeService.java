package training.adv.team.GFINet.team5.service;

import training.adv.team.GFINet.team5.model.Employee;

public interface EmployeeService {

	public String getPasswordById(String employeeId);
	public boolean isPasswordRight(String employeeId,String password);
}
