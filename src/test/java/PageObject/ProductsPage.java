package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver ldriver;
    public ProductsPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    By onlinelink= By.linkText("Online Products");
    By formaldropdown=By.xpath("/html/body/div[2]/center/div/i[1]");
    By sportsdropdown=By.xpath("/html/body/div[3]/center/div/i[1]");
    By sneakersdropdown=By.xpath("/html/body/div[4]/center/div/i[1]");

    public void click_onlineportal(){
        ldriver.findElement(onlinelink).click();
    }
    public void click_formaldropdown(String str){
        ldriver.findElement(formaldropdown).click();
        String formalshoe=ldriver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]")).getText();

        if(formalshoe.trim().equals(str.trim())){

            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }
    public void click_sportsdropdown(String str){
        ldriver.findElement(sportsdropdown).click();
        String sportshoe=ldriver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]")).getText();
        if(sportshoe.trim().equals(str)){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }
    public void click_sneakerdropdown(String str){
        ldriver.findElement(sneakersdropdown).click();
        String sneakershoe=ldriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[1]")).getText();
        String st=sneakershoe.trim();
        if(st.equals(str)){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

}
