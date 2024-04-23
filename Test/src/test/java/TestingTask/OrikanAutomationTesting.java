package TestingTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static TestingTask.Locators.*;

import java.util.concurrent.TimeUnit;

public class OrikanAutomationTesting {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Step 1: Register User
        registerUser(driver, WebAppConfig.USERNAME, WebAppConfig.PASSWORD);

        // Step 2: Fill Personal Information
        fillPersonalInfo(driver, WebAppConfig.FIRST_NAME, WebAppConfig.LAST_NAME);

        // Step 3: Fill Payment Information
        fillPaymentInfo(driver, WebAppConfig.CARD_HOLDER_NAME);

        // Step 4: Agree to Terms and Conditions
        agreeToTerms(driver);

        // Step 5: Complete Registration
        completeRegistration(driver);

        // Close the browser
        driver.quit();
    }

    private static void registerUser(WebDriver driver, String username, String password) {
        driver.get(WebAppConfig.URL);
        driver.findElement(EMAIL_ADDRESS_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(CONFIRM_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(REGISTER_BUTTON_STEP1).click();
    }

    private static void fillPersonalInfo(WebDriver driver, String firstName, String lastName) {
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstName);
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
        driver.findElement(ADDRESS_LINE1_INPUT).sendKeys(WebAppConfig.ADDRESS_LINE1);
        driver.findElement(ADDRESS_LINE2_INPUT).sendKeys(WebAppConfig.ADDRESS_LINE2);
        driver.findElement(POSTCODE_INPUT).sendKeys(WebAppConfig.POSTCODE);
        driver.findElement(CITY_INPUT).sendKeys(WebAppConfig.CITY);
        WebElement state = driver.findElement(STATE_SELECT);
        new Select(state).selectByVisibleText(WebAppConfig.STATE);
        driver.findElement(REGISTER_BUTTON_STEP2).click();
    }

    private static void fillPaymentInfo(WebDriver driver, String firstName) {
        driver.findElement(CARD_HOLDER_NAME_INPUT).sendKeys(firstName);
        driver.findElement(CARD_TYPE_VISA_RADIO).click();
        driver.findElement(CARD_NUMBER_INPUT).sendKeys(WebAppConfig.CARD_NUMBER);
        driver.findElement(CARD_CVV_INPUT).sendKeys(WebAppConfig.CARD_CVV);
        WebElement month = driver.findElement(CARD_EXPIRY_MONTH_SELECT);
        new Select(month).selectByVisibleText(WebAppConfig.CARD_EXPIRY_MONTH);
        driver.findElement(CARD_EXPIRY_YEAR_INPUT).sendKeys(WebAppConfig.CARD_EXPIRY_YEAR);
        driver.findElement(REGISTER_BUTTON_STEP3).click();
    }

    private static void agreeToTerms(WebDriver driver) {
        driver.findElement(AGREE_TO_TERMS_CHECKBOX).click();
    }

    private static void completeRegistration(WebDriver driver) {
        driver.findElement(REGISTER_BUTTON_STEP4).click();
    }
}
