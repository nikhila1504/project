package com.cts.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Contacts;
import com.cts.services.ContactService;
@RestController
@CrossOrigin
@RequestMapping("/contact")

public class ContactController {




	@Autowired
	ContactService service;

	@RequestMapping("/contact")
	List<Contacts> getAllcontacts() {
		return service.getAllcontacts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/contact")
	void addContact(@RequestBody Contacts contact) {
		service.addContact(contact);
	}
	
	@RequestMapping("/contact/{email}")
	Optional<Contacts> getContactDetailsByEmail(@PathVariable String email) {
		return service.getContactDetailsByEmail(email);
	}
	

}	
