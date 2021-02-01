package com.vytrack.step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
      System.out.println("\tthis is coming from BEFORE");
  }
    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER");
    }

    @Before("@db")
    public void setUpDb(){
        System.out.println("\tconneting to dataBase");
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconneting to dataBase");
    }
}
