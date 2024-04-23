package TestingTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class OrikanAutomationAdam {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testRegistrationWithExistingEmail() {
        // Test data
        String username = WebAppConfig.USERNAME2;
        String password = WebAppConfig.PASSWORD2;
        String expectedToastMessage = "Email address is already registered";

        // Navigate to the registration page
        driver.get(WebAppConfig.URL);

        // Fill in registration form
        driver.findElement(Locators.EMAIL_ADDRESS_INPUT).sendKeys(username);
        driver.findElement(Locators.PASSWORD_INPUT).sendKeys(password);
        driver.findElement(Locators.CONFIRM_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(Locators.REGISTER_BUTTON_STEP1).click();

        // Get the toast message
        String actualToastMessage = driver.findElement(By.className("toast-message error active")).getText();

        // Verify toast message
        Assert.assertEquals(actualToastMessage, expectedToastMessage, "Incorrect toast message displayed");
        System.out.println("Test case passed: Registration with existing email detected successfully");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
