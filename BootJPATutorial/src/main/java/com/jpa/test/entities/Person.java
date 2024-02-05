package com.jpa.test.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Person {
//properties
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String fName;
private String lName;
public Person() {
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getfName() {
return fName;
}
public void setfName(String fName) {
this.fName = fName;
}
public String getlName() {
return lName;
}
public void setlName(String lName) {
this.lName = lName;
	}
}