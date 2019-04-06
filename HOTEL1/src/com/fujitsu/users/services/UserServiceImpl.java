package com.fujitsu.users.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Author:Pranita Jagtap
 * Creation Date:2/04/2019
 * Version:2.0
 * CoppyRight:Fujitsu Consultant private Limited
 * Description:Data Access Object component Interface of persistent layer
 * */
import com.fujitsu.users.beans.User;
import com.fujitsu.users.exceptions.ServiceException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private User userDao;

	@Override
	public List<User> findAllUsers() throws ServiceException {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public User findById(int userId) throws ServiceException {
		// TODO Auto-generated method stub
		return userDao.getUserId();
	}

	@Override
	public void add(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}

	@Override
	public void update(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	@Override
	public List<User> sortUsersById() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().sorted().collect(Collectors.toList());
	}

	public List<User> sortUserByUserName() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().sorted((u1,u2)->u1.getUserName().compareTo(u2.getUserName())).collect(Collectors.toList());
		}

	public List<User> sortUserByRole() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllUsers().stream().filter(u->u.getRole().equals(role)).collect(Collectors.toList());
	}

	
	


}
