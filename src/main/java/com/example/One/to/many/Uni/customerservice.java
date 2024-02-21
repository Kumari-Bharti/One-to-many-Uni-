package com.example.One.to.many.Uni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.One.to.Many.Bi.User;
@Service
public class customerservice {
	@Autowired
	private customerrepository repository;

	public List<customer> getuser() {
		return repository.findAll();
	}

	public customer postuser(customer cusId) {
		return repository.save(cusId);
		
	}
	public String detuser(Long cusId) {
		repository.deleteById(cusId);
		return "data deleted";
		
	}

	public String deleteData() {
		repository.deleteAll();
		return "data deleted";
	}

	public customer getuser(Long cusId) {
		return repository.findById(cusId).get();	
	
	}
	public customer updateData(Long cusId, customer Customer) {
		customer data=repository.findById(cusId).get();
		if(data!=null) {
			data.setCusName(Customer.getCusName());
			data.setCusAge(Customer.getCusAge());	
		}
		return repository.save(data);
		
	}
}
	

	

