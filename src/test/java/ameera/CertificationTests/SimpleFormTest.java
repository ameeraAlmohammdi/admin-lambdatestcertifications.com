package ameera.CertificationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormTest extends BaseTest {

	@Test
	public void testSimpleFormDemo() {
		testName = "Simple Form Test";
		// Step 1: Open LambdaTest’s Selenium Playground
		driver.get("https://www.lambdatest.com/selenium-playground");

		// Step 2: Click on the "Simple Form Demo"
		WebElement simpleFormDemoLink = driver.findElement(By.linkText("Simple Form Demo"));
		simpleFormDemoLink.click();

		// Step 3: Validate that the URL contains "simple-form-demo"
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("simple-form-demo"), "URL does not contain 'simple-form-demo'");
		
		String message = "Welcome to LambdaTest";

		WebElement messageTextBox = driver.findElement(By.id("user-message"));
		messageTextBox.sendKeys(message);

		// Step 4: Click the "Get Checked Value" button
		WebElement getCheckedValueButton = driver.findElement(By.id("showInput"));
		getCheckedValueButton.click();

		// Step 5: Validate if the same message appears in the right-hand panel under
		WebElement outputMessage = driver.findElement(By.id("message"));
		String displayedMessage = outputMessage.getText();
		Assert.assertEquals(displayedMessage, message, "The message displayed is not as expected");
	}
}
