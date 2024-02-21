package com.example.One.to.many.Uni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.One.to.Many.Bi.User;




@RestController
public class customercontroller {
	@Autowired
	private customerservice service;
	
	@GetMapping("/getuser")
	public List<customer> getuser(){
		return service.getuser();
	}
	@PostMapping("/postuser")
	public customer postuser(@RequestBody customer cusId){
		return service.postuser(cusId);
}
	@DeleteMapping("/detuser/{cusId}")
	public String detuser(@PathVariable Long cusId) {
		service.detuser(cusId);
		return "data deleted";
	}
	@DeleteMapping("/deleteuser")
	public String deleteData() {
		service.deleteData();
		return "deleted";
	}
	
@GetMapping("/getuser/{cusId}")
public customer getuser(@PathVariable Long cusId) {
	return service.getuser(cusId);
}
@PutMapping("/putuser/{cusId}")
public String putuser(@PathVariable Long cusId,@RequestBody  customer Customer) {
	service.updateData(cusId ,Customer);
	return "data updated";
}
}
	
	
