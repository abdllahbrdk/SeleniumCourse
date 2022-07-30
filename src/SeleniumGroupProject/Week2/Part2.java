package SeleniumGroupProject.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        String testData = "Invalid promo code";

        driver.get("https://shopdemo.e-junkie.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCartButton2 = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        addToCartButton2.click();

        WebElement frameBYCss = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));

        driver.switchTo().frame(frameBYCss);

        WebElement addPromeCodeButton= driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        addPromeCodeButton.click();


        WebElement promoCode = driver.findElement(By.cssSelector("input[placeholder='Promo Code']"));
        promoCode.sendKeys("123456789");


        WebElement applyButton = driver.findElement(By.xpath("//button[text()='Apply']"));
        applyButton.click();

        String invalidPromoCode = driver.findElement(By.cssSelector("div[id='SnackBar']>span")).getText();

        if (testData.equals(invalidPromoCode)){
            System.out.println("Invalid Promo Code is Displayed");
        }else {
            System.out.println("Invalid Promo Code is not Displayed");
        }
    }
}
