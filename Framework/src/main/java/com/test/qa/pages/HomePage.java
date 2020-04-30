package com.test.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.TestBase;

public class HomePage extends TestBase{

	//PAGEFACTORY

	//Register
	@FindBy(xpath = "//a[@class='ico-register']")
	 WebElement registerLink;
	 @FindBy(id = "gender-male")
	 WebElement maleRB;
	 @FindBy(id = "gender-female")
	 WebElement femaleRB;
	 @FindBy(id = "FirstName")
	 WebElement firstName;
	 @FindBy(id = "LastName")
	 WebElement lastName;
	 @FindBy(id = "Email")
	 WebElement email;
	 @FindBy(id = "Password")
	 WebElement password;
	 @FindBy(id = "ConfirmPassword")
	 WebElement confirmPassword;
	 @FindBy(id = "register-button")
	 WebElement registerButton;

	 //Login
	 @FindBy(xpath = "//a[@class='ico-login']")
	 WebElement loginLink;
	 @FindBy(xpath = "//input[@value='Log in']")
	 WebElement loginButton;
	 
	
	 @FindBy(xpath = "//a[@class='ico-logout']")
	 WebElement logoutLink;
	
	
	
	 public HomePage() {
		 PageFactory.initElements(driver, this);
	 }


	 
	 public String  validatehomepageTitle() {

				return driver.getTitle();
	 }
	 
	 public int  Validatehomepagelinks() {
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
			  int linkcount = links.size();
/*			  for (WebElement myElement : links) { 
				  String link = myElement.getText(); 
		   }*/ return linkcount;
	 }
	 public void register() {
		 
		 registerLink.click();
		 maleRB.click();
		 firstName.sendKeys("Fspark");
		 lastName.sendKeys("Lspark");
		 email.sendKeys(prop.getProperty("email"));
		 password.sendKeys(prop.getProperty("password"));
		 confirmPassword.sendKeys(prop.getProperty("password"));
		 registerButton.click();
		 logoutLink.click();
		
		}
	 
	 public void login() {
		 loginLink.click();
		 email.sendKeys(prop.getProperty("email"));
		 password.sendKeys(prop.getProperty("password"));
		 loginButton.click();
		 }
	 
	 
}


