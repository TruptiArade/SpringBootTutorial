package com.jpa.test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.user;
@Repository
public interface UserRepository extends JpaRepository<user,Integer> {
    
}