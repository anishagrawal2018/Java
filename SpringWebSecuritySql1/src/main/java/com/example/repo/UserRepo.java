package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.user;

@Repository
public interface UserRepo extends JpaRepository<user, Integer>{

	public user findByUsername(String username);
		
	
}
