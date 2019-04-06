package com.fujitsu.users.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fujitsu.users.beans.User;
import com.fujitsu.users.exceptions.ServiceException;
import com.fujitsu.users.services.UserService;




@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String viewAllUsers(HttpSession session)
	{
		try {
			List <User> users=userService.findAllUsers();
			session.setAttribute("userList", users);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "userview";
	}
	
	@GetMapping("/add")
	public String addUserForm()
	{
	return "useraddform";
	}
	
	@PostMapping("/adduser")
	public String addUser(User user,ModelMap map)
	{
		try {
			userService.add(user);
			map.addAttribute("message","user " + user.getUserId() + "is saved successfully");
			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("useradderror","Sorry..! user could not be add");
			return "userform";
		}
	}
	
	@GetMapping("/edit")
	public String editUserForm()
	{
		return "usereditform";
	}
	@PostMapping("/edituser")
	public String editUser(User user,ModelMap map)
	{
		try {
			userService.update(user);
			map.addAttribute("message","user " + user.getUserId() + "is edited successfully");
			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("useradderror","Sorry..! user could not be save");
			return "usereditform";
		}
	}
	
	@GetMapping("/delete")
	public String deleteUserForm()
	{
		return "userdeleteform";
		
	}
	@PostMapping("/deleteuser")
	public String deleteUser(User user,ModelMap map)
	{
		try {
			userService.remove(user);
			map.addAttribute("message","user " + user.getUserId() + "is deleted successfully");
			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("useradderror","Sorry..! user could not be deleted");
			return "userdeleteform";
		}
	
}
}
