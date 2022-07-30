package SeleniumGroupProject.Week1.Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement userNameInput = driver.findElement(By.cssSelector("#username"));
        userNameInput.sendKeys("ttechno@gmail.com");

        Thread.sleep(3000);

        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        passwordInput.sendKeys("techno123.");

        Thread.sleep(3000);

        WebElement signInButton = driver.findElement(By.cssSelector("#log-in"));
        signInButton.click();

        Thread.sleep(3000);

        WebElement header = driver.findElement(By.cssSelector("#time"));
        String str = header.getText();
        System.out.println(str);
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is : " + url);
        driver.quit();

    }
}
