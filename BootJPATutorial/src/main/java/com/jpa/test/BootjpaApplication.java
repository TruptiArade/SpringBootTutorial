package com.jpa.test;
import java.util.List;
import java.util.Optional;

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
        /*user user1=new user();
        user1.setName("Vinayak Arade");
        user1.setCity("Kolhapur");
        user1.setStatus("Living");
        
        user user2=new user();
        user2.setName("Snehal Patil");
        user2.setCity("Pune");
        user2.setStatus("Living");
        
        //single object store 
        /*user user1= userrepo.save(user);
        System.out.println(user1);*/
        
        //Create list to store multiple object
        /*List<user> users = List.of(user1,user2);
        Iterable<user> result =userrepo.saveAll(users)*/;
        
      /*  result.forEach(user->{
        	System.out.println(user);
        });*/
        
        /*update data
        
        Optional<user> optional =userrepo.findById(2);
        
        user user= optional.get();
        
        user.setName("Samindar");
        
        user result= userrepo.save(user);
        System.out.println(result);  */
        
        //Delete data
        
        userrepo.deleteById(2);
        System.out.println("deleted");
        
        
        //Retrieve all data
        
      Iterable<user> result= userrepo.findAll();
      
      result.forEach(user->{
    	  System.out.print(user);
      });
        
        
        
    }
} 