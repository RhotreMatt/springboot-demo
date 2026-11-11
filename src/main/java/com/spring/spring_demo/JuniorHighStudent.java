package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy 
public class JuniorHighStudent implements Student {

  public JuniorHighStudent() {
    System.out.println(getClass().getSimpleName() + " was here!");
  }

  @Override
  public String getDailyAssignment() {
    return "Study Math and Science";
  }

}
