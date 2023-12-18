package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,3);
        this.actions = new Actions(driver);

    }

    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
        //elemean gelene kadar bekle
    }

    public WebElement findElement(By key){
        WebElement element = presenceElement(key);  // elemanı bul
        return element;
    }
    public void click(By key){
        findElement(key).click();   //bulunan elamana tıkla

    }
    public void sendKey(By key, String text){

        findElement(key).sendKeys(text);   //bulunan elemana text gir
    }
    public void checkText(By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }

}
