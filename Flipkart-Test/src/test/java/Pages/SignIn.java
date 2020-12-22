package Pages;

import org.openqa.selenium.By;

import utils.CommonUtils;

public class SignIn extends CommonUtils {

	    private final By USERNAME = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	    private final By PASSWORD = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	    private final By SIGNIN_BUTTON = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");

	    public void enterUsername(String userName){
	        System.out.println("SIGNIN_PAGE: Entering username: " + userName);
	        waitForElementToBeVisible(USERNAME);
	        sendKeys(USERNAME, userName);
	    }

	    public void enterPassword(String password){
	        System.out.println("SIGNIN_PAGE: Entering password.");
	        waitForElementToBeVisible(PASSWORD);
	        sendKeys(PASSWORD, password);
	    }

	    public void clickSignInButton(){
	        System.out.println("SIGNIN_PAGE: Clicking the [SIGN_IN] button.\n");
	        click(SIGNIN_BUTTON);
	    }

}
