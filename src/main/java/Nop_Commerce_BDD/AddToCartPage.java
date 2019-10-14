package Nop_Commerce_BDD;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends Utils {
    LoadProperties props = new LoadProperties();

    private By _textOfProductAdded =By.xpath("//a[@class='product-name']");
    private By _checkBoxTermaAndConditions = By.xpath("//input[@id='termsofservice']");
    private By _checkOutButton = By.xpath("//button[@id='checkout']");


    public void verifyUrl() {
        validateUrl(props.getProperty("expected_addToCartPage_url"));
    }
    public void checkProductIsAddedOrNot(){
        waitUntilElementLoadsAndIsClickable(_textOfProductAdded,5000);
        String actual_product_text = getTextFromElement(_textOfProductAdded);
        Assert.assertEquals(actual_product_text,props.getProperty("expected_textofHtcMobile"),"Product added doesnot match");

    }
    public void clickonTermsAndConditionsCheckbox(){
        clickElement(_checkBoxTermaAndConditions);


    }
    public void clickOnCheckoutButton(){

        clickElement(_checkOutButton);
    }
}
