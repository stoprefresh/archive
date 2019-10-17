package com.skilldistillery.videostorerest.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.videostorerest.data.AddressDAO;

@RestController
@RequestMapping("api")
public class AddressController {

	@Autowired
	private AddressDAO dao;
	
	@GetMapping("addresses")
	public List<Address> index(){
		return dao.findAll();
	}
	
	@GetMapping("address/{id}")
	public Address show(@PathVariable int id) {
		return dao.findById(id);
	}
	
	@PostMapping("address")
	public Address addReturn(@RequestBody Address address,
			HttpServletRequest req, HttpServletResponse resp) 
	{
		Address addedAddress;
		try {
			addedAddress = dao.addReturnNewAddress(address);
			resp.setStatus(201);
//			String newAddrUrl = "HTTP://localhost:8081/api/addresses/" + address.getId();
			StringBuffer url = req.getRequestURL();
			url.append("/");
			url.append(address.getId());
			String newAddrUrl = url.toString();
			System.out.println(newAddrUrl);
			resp.addHeader("Location", newAddrUrl); 
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.setStatus(401);
			addedAddress = null;
		}
		
		
		return addedAddress;
	}
	
	
}
