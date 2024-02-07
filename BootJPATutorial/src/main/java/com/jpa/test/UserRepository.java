package com.jpa.test;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.user;
@Repository
public interface UserRepository extends JpaRepository<user,Integer> {
	
	public List<user> findByname(String name);
	
	//public List<user> findBynameAndcity(String name, String city);
    
}