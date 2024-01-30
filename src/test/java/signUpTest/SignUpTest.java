package signUpTest;





import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import faker.fakeGenerator;
import pages.LoggedInPage;
import pages.SignUp;

public class SignUpTest extends BaseTest{
	@Test
	public void testSignUpWithValidCred() {
		SignUp signUp = homePage.clickSignUpLink();
		String name = fakeGenerator.name();
		signUp.setUsername(name);
		signUp.setEmail(fakeGenerator.email());
		signUp.setPassword(fakeGenerator.password());
		@SuppressWarnings("unused")
		LoggedInPage loggedIn = signUp.clickSubmit();
		Assert.assertNotNull(By.linkText(name.toLowerCase()),"error");
		
					
	}
}
