package task;

import org.openqa.selenium.By;

public class task {
	public static By findByPlaceholder(String input) {
		return By.xpath("//input[@placeholder = '" + input + "']");
	}
}
