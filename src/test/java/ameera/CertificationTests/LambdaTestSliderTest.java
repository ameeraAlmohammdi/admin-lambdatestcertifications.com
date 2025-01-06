package ameera.CertificationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaTestSliderTest extends BaseTest {

    @Test
    public void testDragAndDropSlider() {
    	testName = "Drag and Drop Silder Test";
        // Step 1: Open the LambdaTest Selenium Playground page
        driver.get("https://www.lambdatest.com/selenium-playground");

        // Step 2: Click on "Drag & Drop Sliders"
        WebElement dragAndDropSlidersLink = driver.findElement(By.linkText("Drag & Drop Sliders"));
        dragAndDropSlidersLink.click();

        // Step 3: Select the slider "Default value 15"
        WebElement slider = driver.findElement(By.cssSelector("input[value='15']"));

        // Step 4: Use Actions class to drag the slider
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(213, 0).release().build().perform();

        // Step 5: Validate whether the range value shows 95
        WebElement rangeValue = driver.findElement(By.id("rangeSuccess"));
        String rangeText = rangeValue.getText();

        // Validate that the displayed value is 95
        Assert.assertEquals(rangeText, "95", "Slider value is not 95 after drag-and-drop.");
    }
}
