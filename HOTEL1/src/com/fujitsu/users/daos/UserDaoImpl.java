
/*
 * Author:pranita jagtap
 * Creation Date:19/03/2019
 * Modification date:2nd/04/2019
 * Version:6.0
 * Copyright:Fujitsu private limited 
 * Description: It represents DAO
 * It Represents CRUD operation method implementation 
 * it connects with database and perform SQL operations
 * 
 * */



package com.fujitsu.users.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.fujitsu.users.beans.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

		@Autowired
		private HibernateTemplate hibernateTemplate;

		@Override
		public List<User> getAllUsers() {
			// TODO Auto-generated method stub
			
			return hibernateTemplate.loadAll(User.class);
		}

		@Override
		public User getUserById(int userId) {
			// TODO Auto-generated method stub
			return hibernateTemplate.get(User.class,userId);
		}

		@Override
		public void insert(User u) {
			// TODO Auto-generated method stub
			hibernateTemplate.save(u);
		}

		@Override
		public void update(User u1) {
			// TODO Auto-generated method stub
			hibernateTemplate.update(u1);
		}

		@Override
		public void delete(User u2) {
			// TODO Auto-generated method stub
			hibernateTemplate.delete(u2);
	
}
}
