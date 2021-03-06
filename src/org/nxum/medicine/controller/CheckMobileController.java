package org.nxum.medicine.controller;
import org.nxum.medicine.dao.UserDao;
import org.nxum.medicine.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/medicine")
public class CheckMobileController {
@Autowired
private UserDao  dao;
@RequestMapping(value="checkMoblie/{mobile}",method=RequestMethod.GET)
@ResponseBody
public boolean  checkUser(@PathVariable("mobile") String mobile){
	 User user  =  new User(); 
	 user.setMobile(mobile);
	 Integer check =  this.dao.existUserNameAndMobile(user);
	   if(check!=null){
		   return  true;
	   }
	      return false; 
    }
}
