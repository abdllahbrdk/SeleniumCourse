package SeleniumGroupProject.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String numberBasket = "1";
        String emptyBasket = "0";

        WebElement addToCartButton2 = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        addToCartButton2.click();

        WebElement frameBYCss = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frameBYCss);

        String asd = driver.findElement(By.xpath("(//span[@class='Cart-Items-Nos'])[2]")).getText();

        if (numberBasket.equals(asd)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

        WebElement removeButton = driver.findElement(By.cssSelector("button[class='Product-Remove']"));
        removeButton.click();


        WebElement contiuneShoppingButton = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        contiuneShoppingButton.click();

        driver.switchTo().defaultContent();

        String emptyBasket0 = driver.findElement(By.xpath("(//span[@class='EJ-CartItemsNum'])[2]")).getText();
        System.out.println(emptyBasket0);

        if (emptyBasket.equals(emptyBasket0)){
            System.out.println("Basket is 0 ");
        }else {
            System.out.println("Basket is 1");
        }

        driver.quit();


    }
}
