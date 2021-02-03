package com.vytrack.step_definitions;


import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
      System.out.println("\tthis is coming from BEFORE");
  }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot =((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }
         Driver.closeDriver();
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
