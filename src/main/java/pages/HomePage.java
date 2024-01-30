package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	String url = "https://conduit.mate.academy/";
	private By signUpLink = By.linkText("Sign up");
	private WebDriver driver;
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	public SignUp clickSignUpLink() {
		driver.findElement(signUpLink).click();
		return new SignUp(driver);
	}

}
