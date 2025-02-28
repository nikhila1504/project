package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.beans.AddProduct;


public interface AddRepository extends CrudRepository<AddProduct, String>{

	Optional<AddProduct> findById(int id);

}