package com.spring.spring_demo;

public class ElementaryStudent implements Student {

  public ElementaryStudent() {
    System.out.println(getClass().getSimpleName() + " was here!");
  }
  
  @Override
  public String getDailyAssignment() {
    return "have to complete Nihongo Shukudai";
  }

}
