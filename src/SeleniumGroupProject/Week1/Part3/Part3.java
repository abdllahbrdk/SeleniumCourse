package SeleniumGroupProject.Week1.Part3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        String testData = "teddy bear";
        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.sendKeys("teddy bear");

        Thread.sleep(3000);

        WebElement clickSearchButton = driver.findElement(By.cssSelector(".searchTextSpan"));
        clickSearchButton.click();

        Thread.sleep(3000);

        WebElement resultForTeddyBear = driver.findElement(By.cssSelector("#searchMessageContainer>div>span"));
        String str = resultForTeddyBear.getText();
        System.out.println(str);
        String url = driver.getCurrentUrl();
        System.out.println(url);


        WebElement clickOnTheLogo = driver.findElement(By.cssSelector("#sdHeader > div.headerBar.reset-padding > div.topBar.headWrapper.top-freeze-reference-point > div > div.logoWidth.lfloat.col-xs-3.reset-padding > a.notIeLogoHeader.hashAdded > img"));
        clickOnTheLogo.click();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);

        Thread.sleep(3000);

        driver.navigate().back();

        WebElement searchBox2 = driver.findElement(By.id("inputValEnter"));
        String attributeOfTheSearchBox = searchBox2.getAttribute("value");
        System.out.println(attributeOfTheSearchBox);

        Thread.sleep(3000);

        if (attributeOfTheSearchBox.equals(testData)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
        driver.quit();
    }
}
