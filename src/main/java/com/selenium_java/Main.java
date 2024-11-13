package com.selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Main{
 
  public static final String kp_url = "https://www.kupujemprodajem.com/login";
  public static final webBrowser = args[1];
  
  private void setDriverLocation(String path){
    if (webBrowser== "firefox")
      System.setProperty("webdriver.gecko.driver", path);
    else
      System.setProperty("webdriver.chrome.driver", path);
  }



  public static FirefoxOptions setOptions(String[] args){
  
    FirefoxOptions options = new FirefoxOptions();
    
    for (String option: args){
      if (option.charAt(0) == "-")
        options.addArguments(option);
      else
        options.addArguments("-" + option);
    }
    return options;
  }

  public static void main(String[] args){
    
    System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
    

    FirefoxOptions options = setOptions(args);
    
    WebDriver driver = new FirefoxDriver(options);
  
  }
}
