package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
@Lazy 
public class SeniorHighStudent implements Student {

  public SeniorHighStudent() {
    System.out.println(getClass().getSimpleName() + " was here!");
  }
  
  @Override
  public String getDailyAssignment() {
    return "Study Noli Me Tangere";
  }

}