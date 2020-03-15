package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.beans.Contacts;






public interface ContactRepository extends CrudRepository<Contacts, String>{

	Optional<Contacts> findByemail(String email);

}


