package StepDefinitions;

//import io.cucumber.core.logging.Logger;
import PageObject.ProductsPage;
import PageObject.Register_newPage;
import PageObject.signinpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class steps {

    //public Logger logger;
    private WebDriver driver;
    private signinpage lp;
    private Register_newPage rp;
    private ProductsPage pp;
    @Before
    public void setup(){
        driver=new ChromeDriver();
        lp = new signinpage(driver);
        rp= new Register_newPage(driver);
        pp= new ProductsPage(driver);

    }

    @Given("user is on Shoeportal page")
    public void user_is_on_shoeportal_page() {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
    @When("user clicks hamburger menu")
    public void user_clicks_hamburger_menu() throws InterruptedException {
       lp.click_hamburger();
       Thread.sleep(200);
    }
    @When("selects signin portal option")
    public void selects_signin_portal_option() throws InterruptedException {
        lp.click_siginportal();
        Thread.sleep(200);
    }
    @Then("User should be able to enter username and pasword")
    public void user_should_be_able_to_enter_username_and_pasword() {
        lp.enter_uname("abcd");
        lp.enter_pwd("abcd");

    }
    @Then("click on Login button")
    public void click_on_login_button() {
        lp.click_login();
        if(driver.getPageSource().contains("Formal Shoes")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

    // Register New Customer

    @When("user clicks on register new button")
    public void user_clicks_on_register_new_button() {
        lp.click_newreg();
    }
    @Then("enters required information")
    public void enters_required_information() {
        rp.enter_fname();
        rp.enter_lname();
        rp.enter_email();
        rp.enter_contact();
        rp.enter_uname();
        rp.enter_pwd();
    }
    @Then("click submit button")
    public void click_submit_button() throws InterruptedException {
        rp.click_submit();
        Thread.sleep(200);
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
       if(driver.getPageSource().contains(string)){
           Assert.assertTrue(true);
       }
       else{
           Assert.assertTrue(false);
       }
    }


    //Online Shoe Portal validation

    @When("selects Online Products option")
    public void selects_online_products_option() {
        pp.click_onlineportal();
    }
    @Then("check first formal shoe is {string}")
    public void check_first_formal_shoe_is(String string) {
        pp.click_formaldropdown(string);
    }
    @Then("First sports shoe is {string}")
    public void first_sports_shoe_is(String string) {
        pp.click_sportsdropdown(string);
    }
    @Then("First Sneaker shoe is {string}")
    public void first_sneaker_shoe_is(String string) {
        pp.click_sneakerdropdown(string);
    }

    @After
    public void tear_down(){
        driver.quit();
    }
}
