package Nop_Commerce_BDD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
  Homepage homepage = new Homepage();
  Registration registration = new Registration();
  MacProProductPage macProProductPage = new MacProProductPage();
  EmailAFriend emailAFriend = new EmailAFriend();
  HtcOnePhonePage htcOnePhonePage = new HtcOnePhonePage();
  CheckoutPage checkoutPage = new CheckoutPage();
  AddToCartPage addToCartPage = new AddToCartPage();


    @Given("^user is on registration page$")
    public void user_is_on_registration_page()  {
        homepage.verifyUrl();
        homepage.clickOnRegisterButton();
    }

    @When("^when user enters all compulsory fields$")
    public void when_user_enters_all_compulsory_fields()  {
       // registration.verifyurl();
        registration.enterRegistrationDetails();
    }

    @When("^clicks register button$")
    public void clicks_register_button() {
        registration.clicksOnSubmitButton();

    }

    @Then("^sees confirmation message display$")
    public void sees_confirmation_message_display() {
        registration.confirmMessageDisplay();


    }
    //feature @email
    @Given("^Registered user is on product page$")
    public void registered_user_is_on_product_page() {
      homepage.verifyUrl();
      homepage.clickOnRegisterButton();
      registration.enterRegistrationDetails();
      registration.clicksOnSubmitButton();
      registration.confirmMessageDisplay();
      registration.navigateToHomePage();//navigating to homepage
      homepage.clickOnImacPro();//clicking on imac to refer it to a friend
      macProProductPage.verifyUrl();//confirming that user is navigated to  relevant product page
    }


    @When("^clicks on Email a Friend button$")
    public void clicks_on_Email_a_Friend_button() {
      macProProductPage.clickOnEmailAfriendButton();//clicking on email a friend
    }

    @When("^fills email details$")
    public void fills_email_details() {
      emailAFriend.verifyUrl();//confirming the navigation to email a friend page
      emailAFriend.fillEmailDetails();// filling details and clicking on send email button

    }

    @When("^clicks on Send Email Button$")
    public void clicks_on_Send_Email_Button(){
      emailAFriend.clickingOnSendEmailButton();//clicking on send email button
    }

    @Then("^sees a sent email confirmation message display$")
    public void sees_a_sent_email_confirmation_message_display() {
      emailAFriend.validatingConfirmationMsg();// confirming that email is successfully sent

    }

    @Given("^User is on product page$")
    public void user_is_on_product_page() {
      homepage.verifyUrl();
      homepage.clickOnImacPro();//clicking on imac to refer it to a friend
      macProProductPage.verifyUrl();//confirming that user is navigated to  relevant product page


    }

    @Then("^sees an error message display$")
    public void sees_an_error_message_display() {
      emailAFriend.validatingErrorMsg();//verifying error msg

    }

    //feature @ checkout

  @Given("^Registered user is on htc_mobile page$")
  public void registered_user_is_on_htc_mobile_page() {
    homepage.validateTitle();// gives homepage page title

    homepage.clickOnRegisterButton();// clicking register button on homepage
    registration.verifyurl(); // verifying tthat user is navigated to registration page
    registration.enterRegistrationDetails();//entering details in all compulsory fields
    registration.clicksOnSubmitButton();
    registration.confirmMessageDisplay();
    registration.navigateToHomePage();
    homepage.clickOnHtcOneMobilePhone();
  }

  @When("^clicks on Add to Cart button$")
  public void clicks_on_Add_to_Cart_button() {
      //htcOnePhonePage.verifyUrl();
      htcOnePhonePage.clickAddToCartButton();

  }

  @When("^clicks on Shopping Cart link$")
  public void clicks_on_Shopping_Cart_link() {
      htcOnePhonePage.clickShoppingCartLink();
      addToCartPage.verifyUrl();

  }

  @When("^clicks on accept terms and conditions checkbox$")
  public void clicks_on_accept_terms_and_conditions_checkbox() {
    addToCartPage.checkProductIsAddedOrNot();
    addToCartPage.clickonTermsAndConditionsCheckbox();
  }

  @When("^clicks on Checkout button$")
  public void clicks_on_Checkout_button() {
      addToCartPage.clickOnCheckoutButton();
  }

  @When("^fills billing address details$")
  public void fills_billing_address_details() {
      checkoutPage.clickingAllContinueLinksAndFillingBillingAddress();
  }

  @When("^fills card details$")
  public void fills_card_details()  {
      checkoutPage.fillCrediCardDetails();
  }

  @Then("^sees a order successfully processed message display$")
  public void sees_a_order_successfully_processed_message_display(){
      checkoutPage.orderStatusMessageDisplay();
  }

  @Given("^User is on htc_mobile page$")
  public void user_is_on_htc_mobile_page() {
    homepage.clickOnHtcOneMobilePhone();//clicking on product to open product page
    htcOnePhonePage.verifyUrl();//verifying that user is navigated to product page
    htcOnePhonePage.clickAddToCartButton();//clicking on add to cart button
  }
  @When("^clicks on checkout as guest button$")
  public void clicks_on_checkout_as_guest_button() {

      checkoutPage.clickOnCheckOutAsGuestLink();
      checkoutPage.fillGuestForm();
  }



}
