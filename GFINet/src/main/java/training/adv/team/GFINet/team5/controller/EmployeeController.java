package training.adv.team.GFINet.team5.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.stream.events.StartDocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import training.adv.team.GFINet.team5.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/start")
	public String Start()
	{
		return "login";
	}
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView loginPost(HttpServletRequest request, HttpServletResponse response) {

		String employeeId = (String)request.getParameter("e_id");
		String password = (String)request.getParameter("e_password");

		HttpSession session = request.getSession(false);
		ModelAndView mav;

		Boolean passwordRight = employeeService.isPasswordRight(employeeId, password);
		System.out.println("1");
		if(passwordRight == true) {
			mav = new ModelAndView("test1");

			session.setAttribute("user", employeeId);
		}else{
			mav = new ModelAndView("login"); 
			mav.addObject("state", "密码错误");
		};

		return mav; 
	} 
}
