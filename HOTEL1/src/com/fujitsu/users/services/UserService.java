package com.fujitsu.users.services;



import java.util.List;

/*
 * Author:Pranita Jagtap
 * Creation Date:19/03/2019
 * Modification Date:28/03/2019
 * Version:1.0
 * CoppyRight:Fujitsu Consultant private Limited
 * Description: Service component Interface of Bussiness Layer
 * */
import com.fujitsu.users.beans.User;
import com.fujitsu.users.exceptions.ServiceException;


public interface UserService {
	
	
	List<User> findAllUsers()throws ServiceException;
	User findById(int userId)throws ServiceException;
	
	void add(User user)throws ServiceException;
	void update(User user)throws ServiceException;
	void remove(User user)throws ServiceException;

	List<User>sortUsersById()throws ServiceException;
	List<User>sortUserByUserName(String userName)throws ServiceException;
	List<User>sortUserByRole(String role)throws ServiceException;




}