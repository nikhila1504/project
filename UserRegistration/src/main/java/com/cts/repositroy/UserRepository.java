package com.cts.repositroy;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cts.beans.Users;

public interface UserRepository extends CrudRepository<Users, Integer>{

	Optional<Users> findById(int id);


}