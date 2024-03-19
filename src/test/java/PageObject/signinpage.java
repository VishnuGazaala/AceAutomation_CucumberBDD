package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
    WebDriver ldriver;
    public signinpage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    By hamburger=By.xpath("//*[@id=\"menuToggle\"]/input");
    By signinportal=By.linkText("Sign In Portal");
    By username=By.xpath("//*[@id=\"usr\"]");
    By password=By.xpath("//*[@id=\"pwd\"]");
    By loginbut=By.xpath("//*[@id=\"second_form\"]/input");
    By newregister=By.xpath("//*[@id=\"NewRegistration\"]");

    public void click_hamburger(){
        ldriver.findElement(hamburger).click();
    }
    public void click_siginportal(){
        ldriver.findElement(signinportal).click();
    }
    public void enter_uname(String name){
        WebElement uname= ldriver.findElement(username);
        uname.clear();
        uname.sendKeys(name);
    }
    public void enter_pwd(String pwd){
        WebElement pass= ldriver.findElement(password);
        pass.clear();
        pass.sendKeys(pwd);
    }
    public void click_login(){
        ldriver.findElement(loginbut).click();
    }
    public void click_newreg(){
        ldriver.findElement(newregister).click();
    }



}
