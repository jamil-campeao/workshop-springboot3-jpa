package com.jamil.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamil.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
