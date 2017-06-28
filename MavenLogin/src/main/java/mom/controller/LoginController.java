package mom.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mom.dao.LoginDaoImpl;
import mom.model.Login;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mom.entity.*;


@Controller
public class LoginController {
	
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView view =new ModelAndView("login");
		return view;
	}
	
	
	
	@RequestMapping(value="/loginsuccess.html", method=RequestMethod.POST)                                            
	public ModelAndView login(Login login, BindingResult result)             
	{
		
		if(result.hasErrors())
		   {
			ModelAndView model2 = new ModelAndView("login");   
			model2.addObject("headerMsg", "Enter the correct format");  
			return model2;	
		   }
		    //to check the existing user
		
		
		    LoginDaoImpl dao=new  LoginDaoImpl();
		
			login = dao.checkLogin(login);
			Boolean checkLogin=login.isCheckLogin();
			if(checkLogin  &&  login.getRole().equals("admin")){				
				ModelAndView model3 = new ModelAndView("admin");
				return model3;				
			}
			else if(checkLogin  &&  login.getRole().equals("teacher")){				
				ModelAndView model3 = new ModelAndView("teacher");
				return model3;				
			}
			else if(checkLogin  &&  login.getRole().equals("student")){				
				ModelAndView model3 = new ModelAndView("student");
				return model3;				
			}
			else if(checkLogin  &&  login.getRole().equals("driver")){				
				ModelAndView model3 = new ModelAndView("driver");
				return model3;				
			}
			else
			{
				ModelAndView model3 = new ModelAndView("login");
				return model3;
			}				
	}
	
	
	

	@RequestMapping(value="/list", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(){
				
		 Map<String,Object> map = new HashMap<String,Object>();
		 	
		 	mom.dao.LoginDaoImpl dao = new mom.dao.LoginDaoImpl();
			List<BusSchedule> list = dao.getSchedule();
			 		
			if (list != null){
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}else{
				map.put("status","404");
				map.put("message","Data not found");			
			}
		
		  return map;
	}
	
}
