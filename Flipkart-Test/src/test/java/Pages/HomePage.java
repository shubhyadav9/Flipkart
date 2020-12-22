package Pages;

import Enums.Url;
import org.openqa.selenium.By;
import utils.CommonUtils;

public class HomePage extends CommonUtils {

	private final By YOUR_ACCOUNT = By.id("nav-link-yourAccount");
    private final By SHOPPING_CART_ICON = By.xpath("//a[@class='_3SkBxJ']");

    public HomePage(){
    }

    public void navigateToHomePage() {
        String url = Url.BASEURL.getURL();
        System.out.println("Navigating to flipkart.com: " + url);
        navigateToURL(url);
    }

    public void navigateToSignInPage(){
        System.out.println("HOME_PAGE: Selecting [YOUR_ACCOUNT] in navigation bar.");
        scrollToThenClick(YOUR_ACCOUNT);
        System.out.println("HOME_PAGE: Navigating to the SIGNIN_PAGE.\n");
    }

    public void signOutWithSignOutLink(){
        String url = Url.BASEURL.getURL() + Url.SIGNOUT.getURL();
        navigateToURL(url);
    }

    public void selectShoppingCartIcon(){
        click(SHOPPING_CART_ICON);
    }

    
    
}
