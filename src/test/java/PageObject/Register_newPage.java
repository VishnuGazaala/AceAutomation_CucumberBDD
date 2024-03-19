package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Register_newPage {
    WebDriver ldriver;
    public Register_newPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    By fname=By.xpath("//*[@id=\"firstname\"]");
    By lname=By.xpath("//*[@id=\"lastname\"]");//*[@id="lastname"]
    By emailid=By.xpath("//*[@id=\"emailId\"]");
    By number=By.xpath("//*[@id=\"contactNumber\"]");
    By uname=By.xpath("//*[@id=\"usr\"]");
    By pwd=By.xpath("//*[@id=\"pwd\"]");
    //By submit=By.className("btn btn-primary");
    By submit=By.xpath("//*[@id=\"first_form\"]/div/div[2]/center/input");
    //*[@id="first_form"]/div/div[2]/center/input

    public void enter_fname(){
        ldriver.findElement(fname).sendKeys("abcd");
    }
    public void enter_lname(){
        ldriver.findElement(lname).sendKeys("abcd");
    }
    public void enter_email(){
        ldriver.findElement(emailid).sendKeys("abcd@gmail.com");
    }
    public void enter_contact(){
        ldriver.findElement(number).sendKeys("9345216490");
    }
    public void enter_uname(){
        ldriver.findElement(uname).sendKeys("abcd");
    }
    public void enter_pwd(){
        ldriver.findElement(pwd).sendKeys("abcd");
    }
    public void click_submit(){
        ldriver.findElement(submit).click();
    }

}
