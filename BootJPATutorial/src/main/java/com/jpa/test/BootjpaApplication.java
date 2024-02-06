package com.jpa.test;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.UserRepository;
import com.jpa.test.user;
@SpringBootApplication
public class BootjpaApplication {

    public static void main(String[] args) 
    {
        ApplicationContext context= SpringApplication.run(BootjpaApplication.class, args);
        UserRepository userrepo= context.getBean(UserRepository.class);
        user user=new user();
        user.setName("Trupti Arade");
        user.setCity("Kolhapur");
        user.setStatus("Living");
        user user1= userrepo.save(user);
        System.out.println(user1);
    }
} 