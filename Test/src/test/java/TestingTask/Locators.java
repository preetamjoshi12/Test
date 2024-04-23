package TestingTask;

import org.openqa.selenium.By;

public class Locators {
	
	    // Login Page Locators
	    public static final By EMAIL_ADDRESS_INPUT = By.id("emailAddress");
	    public static final By PASSWORD_INPUT = By.id("password");
	    public static final By CONFIRM_PASSWORD_INPUT = By.id("confirmPassword");
	    public static final By REGISTER_BUTTON_STEP1 = By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button");

	    // Personal Information Page Locators
	    public static final By FIRST_NAME_INPUT = By.id("firstName");
	    public static final By LAST_NAME_INPUT = By.id("lastName");
	    public static final By ADDRESS_LINE1_INPUT = By.id("addressLine1");
	    public static final By ADDRESS_LINE2_INPUT = By.id("addressLine2");
	    public static final By POSTCODE_INPUT = By.id("postcode");
	    public static final By CITY_INPUT = By.id("city");
	    public static final By STATE_SELECT = By.id("state");
	    public static final By REGISTER_BUTTON_STEP2 = By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]");

	    // Payment Information Page Locators
	    public static final By CARD_HOLDER_NAME_INPUT = By.id("cardHolderName");
	    public static final By CARD_TYPE_VISA_RADIO = By.id("cardTypeVISA");
	    public static final By CARD_NUMBER_INPUT = By.id("cardNumber");
	    public static final By CARD_CVV_INPUT = By.id("cardCVV");
	    public static final By CARD_EXPIRY_MONTH_SELECT = By.id("cardExpiryMonth");
	    public static final By CARD_EXPIRY_YEAR_INPUT = By.id("cardExpiryYear");
	    public static final By REGISTER_BUTTON_STEP3 = By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]");

	    // Terms and Conditions Page Locators
	    public static final By AGREE_TO_TERMS_CHECKBOX = By.id("agreedToTerms");
	    public static final By REGISTER_BUTTON_STEP4 = By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button[2]");
	}



