package com.spring.spring_demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UniversityStudent implements Student {

  public UniversityStudent() {
    System.out.println(getClass().getSimpleName() + " was here!");
  }
  
  @Override 
  public String getDailyAssignment() {
    return "Study Spring Boot coding";
  }

}
