/*
 * Author:pranita jagtap
 * Creation Date:19/03/2019
 * Modification date:2nd/04/2019
 * Version:3.0
 * Copyright:Fujitsu private limited 
 * Description: It represents DAO
 * It Represents CRUD operation method
 * 
 * */



package com.fujitsu.users.daos;

import java.util.List;

import com.fujitsu.users.beans.User;

public interface UserDao {
	
	
	List<User> getAllUsers();
	User getUserById(int userId) ;
	void insert (User user) ;
	void update(User user) ;
	void delete(User user) ;

}
