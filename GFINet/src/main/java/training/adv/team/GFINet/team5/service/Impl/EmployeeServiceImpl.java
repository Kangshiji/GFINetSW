package training.adv.team.GFINet.team5.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.adv.team.GFINet.team5.dao.EmployeeDao;
import training.adv.team.GFINet.team5.model.Employee;
import training.adv.team.GFINet.team5.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public String getPasswordById(String employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getPasswordByEmployeeId(employeeId);
	}

	@Override
	public boolean isPasswordRight(String employeeId, String password) {
		// TODO Auto-generated method stub
		String passwordString = getPasswordById(employeeId);
		if(password.equals(passwordString))
		{
			return true;
		}
		else
		{
			return false;
		}
	}





}
