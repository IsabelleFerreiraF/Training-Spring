package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rockers.api.model.User;


@Component
public class UserDao implements Crud<User> {

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		User c = new User();
		c.setId(id);
		c.setWiproEmail("email@wipro.com");
		return c;
	}

	@Override
	public String save(User t) {
		// TODO Auto-generated method stub
		t.setId("hehehe");
		return t.getId();
	}

	@Override
	public List<User> listAll() {
		User u = new User();
		u.setId("You are in list 1");
		u.setWiproEmail("email@wipro.com");
		
		User s = new User();
		s.setId("You are in list 2");
		s.setWiproEmail("email@wipro.com");
		
		List<User> x = new ArrayList<User>();
		x.add(u);
		x.add(s);
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}





	

}
