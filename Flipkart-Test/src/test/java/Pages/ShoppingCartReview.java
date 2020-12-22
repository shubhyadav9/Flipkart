package Pages;

import org.openqa.selenium.By;
import org.testng.TestException;

import utils.CommonUtils;

public class ShoppingCartReview extends CommonUtils {

	private final By CART_BUTTON = By.xpath("//a[@class='_3SkBxJ']");
    private final By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']");
    private final By PRICE = By.cssSelector("[class='a-color-price hlb-price a-inline-block a-text-bold']");

    public void verifyOnShoppingCartReviewPage(){
        String url = getCurrentURL();
        System.out.println("SHOPPING_CART_REVIEW_PAGE: Verifying that we are on SHOPPING_CART_REVIEW_PAGE.");
        if (!url.contains("view")){
            throw new TestException("ERROR: Not on SHOPPING_CART_REVIEW_PAGE! URL: " + url);
        }
    }

    public String getCartSubtotal(){
        return getElementText(PRICE);
    }

    public void clickProceedToCheckoutButton(){
        click(PROCEED_TO_CHECKOUT_BUTTON);
    }

    public void clickCartButton() {
        click(CART_BUTTON);
    }
}
