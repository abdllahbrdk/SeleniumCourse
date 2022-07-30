package SeleniumGroupProject.Week1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        String fullNameBox = "Automation";
        String email = "Testing@gmail.com";
        String currentAdress = "Testing Current Address";
        String permanentAddress = "Testing Permanent Address";


        driver.get("http://demoqa.com/text-box");

        //First maximize the window
        driver.manage().window().maximize();

        WebElement fullNameInput = driver.findElement(By.cssSelector("#userName"));
        fullNameInput.sendKeys(fullNameBox);
        Thread.sleep(3000);


        WebElement eMailInput = driver.findElement(By.id("userEmail"));
        eMailInput.sendKeys(email);

        Thread.sleep(2000);

        WebElement addressInput = driver.findElement(By.cssSelector("#currentAddress"));
        addressInput.sendKeys(currentAdress);

        Thread.sleep(3000);

        WebElement permanentAdressInput = driver.findElement(By.cssSelector("#permanentAddress"));
        permanentAdressInput.sendKeys(permanentAddress);

        Thread.sleep(2000);


        WebElement clickingTheSubmitButton = driver.findElement(By.cssSelector("#submit"));
        clickingTheSubmitButton.click();

        Thread.sleep(2000);

        WebElement nameGet = driver.findElement(By.cssSelector("#name"));
        String displayedName = nameGet.getText();

        if (displayedName.contains(fullNameBox)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

        WebElement emailGet = driver.findElement(By.cssSelector("#email"));
        String displayedEmail = emailGet.getText();

        if (displayedEmail.contains(email)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

        WebElement currentAdressGet = driver.findElement(By.cssSelector("p[id = 'currentAddress']"));
        String displatedCurrentAdress = currentAdressGet.getText();

        if (displatedCurrentAdress.contains(currentAdress)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

        WebElement permanentAdressGet = driver.findElement(By.cssSelector("p[id = 'permanentAddress']"));
        String displayedPermanentText =permanentAdressGet.getText();

        if (displayedPermanentText.contains(permanentAddress)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

        driver.quit();






    }
}
