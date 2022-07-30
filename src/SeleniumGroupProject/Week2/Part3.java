package SeleniumGroupProject.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopdemo.e-junkie.com/");

        String testData = "Invalid Email\nInvalid Email\nInvalid Billing Name";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCartButton2 = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        addToCartButton2.click();

        WebElement frameBYCss = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));

        driver.switchTo().frame(frameBYCss);

        WebElement payDebitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        payDebitCard.click();

        WebElement payButton = driver.findElement(By.xpath("//button[text()='Pay 0.50 USD']"));
        payButton.click();

        String popUp = driver.findElement(By.cssSelector("div[id='SnackBar']>span")).getText();

        if (testData.equals(popUp)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
    }
}
