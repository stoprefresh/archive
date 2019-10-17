package com.skilldistillery.videostorerest.repositories;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.jpavideostore.entities.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
class AddressRepositoryTests {
	
	@Autowired
	private AddressRepository repo;

	@Test
	void test_AddressRepository_findById() {
		Optional <Address> addrOpt = repo.findById(1);
		if(addrOpt.isPresent()) {
			Address addr = addrOpt.get();
			assertEquals("47 MySakila Drive", addr.getStreet());
		}
	}
	
}
