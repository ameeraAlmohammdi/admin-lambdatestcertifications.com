package ameera.CertificationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaTestInputFormTest extends BaseTest {
	
	@Test
	public void testInputFormSubmit() {
		testName = "Input Form Submit Test";
		// Step 1: Open the LambdaTest Selenium Playground page
		driver.get("https://www.lambdatest.com/selenium-playground");

		// Step 2: Click on "Input Form Submit"
		WebElement inputFormSubmitLink = driver.findElement(By.linkText("Input Form Submit"));
		inputFormSubmitLink.click();

		// Step 3: Click "Submit" without filling in any information in the form
		WebElement submitButton = driver.findElement(By.cssSelector("[class*='bg-lambda-900']"));
		submitButton.click();
		// Step 4: Assert the error message "Please fill out this field."
		WebElement nameField = driver.findElement(By.name("name"));
		String errorMessage = nameField.getAttribute("validationMessage");
		Assert.assertTrue(errorMessage.toLowerCase().contains("fill out this field".toLowerCase()));


		// Step 4: Fill in the Name, Email, and other fields
		driver.findElement(By.name("name")).sendKeys("Ameera Almohammadi");
		driver.findElement(By.id("inputEmail4")).sendKeys("ameera.almohammadi@example.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#company")).sendKeys("Elm Street");
		driver.findElement(By.xpath("//input[@id='websitename']")).sendKeys("Some City Website");
		driver.findElement(By.cssSelector("#inputCity")).sendKeys("Saudi");
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("Addressc1");
		driver.findElement(By.id("inputAddress2")).sendKeys("Address2");

		driver.findElement(By.cssSelector("#inputState")).sendKeys("Stage Value");
		driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("342574");

		// Step 5: Select "United States" from the Country drop-down using the text
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText("United States");

		// Step 7: Click "Submit" after filling out all fields
		submitButton.click();

		// Step 8: Validate the success message
		WebElement successMessage = driver.findElement(By.cssSelector(".success-msg.hidden"));
		Assert.assertTrue(
				successMessage.getText().contains("Thanks for contacting us, we will get back to you shortly."),
				"Success message not displayed.");
	}

}
