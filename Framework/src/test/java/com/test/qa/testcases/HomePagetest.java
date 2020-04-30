package com.test.qa.testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.qa.base.TestBase;
import com.test.qa.pages.*;

public class HomePagetest extends TestBase{
  
HomePage HP;

public HomePagetest() {
		super();
	}


@BeforeTest
public void setup() {
	initialization();
	HP = new HomePage();
}

@Test(priority = 1)
public  void validateloginpageTitle() {
	
	String hpTitle = HP.validatehomepageTitle();
	Assert.assertEquals(hpTitle, "Demo Web Shop");
	
	}

@Test(priority = 2)
public  void validatehomepageLinks() {
	
	int linkcount = HP.Validatehomepagelinks();
	int linkCountfromfile = Integer.parseInt(prop.getProperty("Links"));
	Assert.assertEquals(linkcount, linkCountfromfile);
	}

@Test(enabled=false)
public void registerTest() {	
	HP.register();	
}

@Test(priority = 4)
public void loginTest() {
	HP.login();
}

@AfterTest
public void tearDown() {
	driver.quit();
	}

}
