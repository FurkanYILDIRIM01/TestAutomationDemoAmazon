package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchbutton = By.id("nav-search-submit-button");
    static By amazonFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(25) > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(4) > span:nth-child(1) > span:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By appleFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(25) > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > span:nth-child(1) > span:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By productClick = By.cssSelector("img[alt='Apple AirPods Pro (2. nesil) ve MagSafe Şarj Kutusu']");
    static By addCart = By.id("add-to-cart-button");
    static By checkCartText = By.cssSelector(".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold");


    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,3);
        this.elementHelper = new ElementHelper(driver);
        
    }

    public static void homePage() {
    }

    public static void acceptCokie() {
        elementHelper.click(accept);
    }

    public static void clickSearchButton() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
    }

    public static void clickProductSearch() {
        elementHelper.click(searchbutton);
    }

    public static void filterShippedByAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void clickFirstProduct() {
        elementHelper.click(productClick);
    }

    public static void addCard() {
        elementHelper.click(addCart);
    }

    public static void checkCard() {
        elementHelper.checkText(checkCartText);

    }
}
