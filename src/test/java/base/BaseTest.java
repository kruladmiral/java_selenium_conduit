package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import faker.fakeGenerator;
import task.task;

public class BaseTest {
	private WebDriver driver;
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://conduit.mate.academy/");
	driver.manage().window().setSize(new Dimension(375, 812));
	System.out.println(driver.getTitle());
	List<WebElement> navLinks = driver.findElements(By.className("nav-link"));
	System.out.println(navLinks.size());
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		signIn.click();
		System.out.println(fakeGenerator.name());
		
		driver.quit();
		
	}
	public static void main(String[] args) {
		BaseTest test = new BaseTest();
		test.setUp();
		test.signUp();
		
	}
	public void signUp() {
		driver = new ChromeDriver();
		driver.get("https://conduit.mate.academy/");
		driver.manage().window().fullscreen();
		WebElement signUp = driver.findElement(By.linkText("Sign up"));
		signUp.click();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(fakeGenerator.name());
		WebElement email = driver.findElement(By.xpath("//input[@placeholder = 'Email']"));
		email.sendKeys(fakeGenerator.email());
		WebElement password  = driver.findElement(task.findByPlaceholder("Password"));
		password.sendKeys(fakeGenerator.password());
		WebElement submit = driver.findElement(By.className("btn"));
		submit.click();
		driver.quit();
	}
}
