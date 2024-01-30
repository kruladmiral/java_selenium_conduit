package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import task.task;

public class SignUp {

	private WebDriver driver;
	private By nameField = task.findByPlaceholder("Username");
	private By emailField = task.findByPlaceholder("Email");
	private By passwordField = task.findByPlaceholder("Password");
	private By submitButton = By.className("btn");

	public SignUp(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername (String username) {
		driver.findElement(nameField).sendKeys(username);
	}
	public void setEmail (String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	public void setPassword (String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public  LoggedInPage clickSubmit () {
		driver.findElement(submitButton).click();
		return new LoggedInPage(driver);
	}

}
