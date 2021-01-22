package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoContent;
import generics.ExcelLibrary;

public class POMActitimeLogin implements AutoContent
{
	@FindBy(id="username")
	private WebElement usernameTextField ;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeLoggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotPassword;
	
	//Initialization
	
	public POMActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	
	public void LoginMethod() throws IOException
	{
		usernameTextField.sendKeys(ExcelLibrary.getCellValue(ExcelFile, Sheet, 0, 0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(ExcelFile, Sheet, 0, 1));
		keepmeLoggedinCheckbox.click();
		loginButton.click();
		
	}
	

}
