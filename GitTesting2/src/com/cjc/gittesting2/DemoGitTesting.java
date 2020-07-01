package com.cjc.gittesting2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoGitTesting {
	
	public WebDriver driver;
	
	
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\cjc\\core\\Testing\\exefile\\chromedriver.exe");
		
		driver=new ChromeDriver();
		System.out.println("chrome browser opened sucessfully");
		
	}
	
	@Test
	public void url()
	{
		System.out.println("welcome url1");
		driver.get("https://www.facebook.com/");
		System.out.println("URL sucessfully opened");
		Syetem.out.println("nice work");
	}
    
	
	
}
