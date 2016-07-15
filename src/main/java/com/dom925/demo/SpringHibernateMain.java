package com.dom925.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dom925.demo.spring.hibernate.model.Person;
import com.dom925.demo.spring.hibernate.service.PersonService;

public class SpringHibernateMain {

 public static void main(String[] args) {
  ApplicationContext context = 
    new ClassPathXmlApplicationContext(
      "/META-INF/spring/app-context.xml");
  PersonService personService = 
    context.getBean("personServiceImpl", PersonService.class);
  
  Person person = new Person();
  person.setFirstName("HILLARY");
  person.setLastName("CLINTON");
  personService.insertPerson(person);
  
  for (Person p : personService.getAllPersons()){
   System.out.println(p);
  }
 }
}
