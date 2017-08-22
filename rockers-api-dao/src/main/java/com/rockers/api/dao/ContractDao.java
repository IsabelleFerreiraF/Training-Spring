package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Contract;
import com.rockers.api.model.User;

@Component
public  class ContractDao implements Crud<Contract>{

	@Override
	public Contract findOne(String id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId("ID User Contract");
		
		Contract c = new Contract();
		c.setId(id);
		c.setProject("project");
		c.setUser(user);
		
		return c;
	}

	@Override
	public String save(Contract t) {
		
		// TODO Auto-generated method stub
		t.setId("Contract save");
		return t.getId();
	}

	@Override
	public List<Contract> listAll() {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setId("ID User Contract");
		user1.setWiproEmail("email@wipro.com");
		
		Contract c = new Contract();
		c.setId("Id user1");
		c.setProject("project 321");
		c.setUser(user1);
		
		User user2 = new User();
		user2.setId("ID User Contract");
		user2.setWiproEmail("user2@wipro.com");
		
		Contract o = new Contract();
		o.setId("Id User 2");
		o.setProject("project 123");
		o.setUser(user2);
		
		List<Contract> list = new ArrayList<Contract>();
		list.add(c);
		list.add(o);
		return list;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}
