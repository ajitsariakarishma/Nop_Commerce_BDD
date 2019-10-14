package Nop_Commerce_BDD;

import org.openqa.selenium.By;

public class HtcOnePhonePage extends Utils {
    LoadProperties props = new LoadProperties();


    private By _addToCartButton=By.xpath("//input[@id='add-to-cart-button-18']");
    private By _shoppingCartLink=By.xpath("//span[@class='cart-label']");

    public void verifyUrl() {
        validateUrl(props.getProperty("expected_htc_one_phone_url"));
    }
    public void clickAddToCartButton(){
        waitUntilElementLoadsAndIsClickable(_addToCartButton,5000);
        clickElement(_addToCartButton);
    }


    public void clickShoppingCartLink(){

        waitUntilElementLoadsAndIsClickable(_shoppingCartLink,5000);
        clickElement(_shoppingCartLink);


    }

}
