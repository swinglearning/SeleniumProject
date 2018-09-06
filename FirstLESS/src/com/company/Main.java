package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;


public class Main {

	// write your code here
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWING\\Desktop\\chromedriver.exe");
            WebDriver ChromeDriver = new ChromeDriver();

            String BaseUrl = "http://www.gopro.com";
            String ExpectedTitle = "GoPro - Cameras";

            ChromeDriver.get(BaseUrl);
            if(ExpectedTitle.equals(ChromeDriver.getTitle()));{
                System.out.print("first test is Pass");
            }
            WebDriverWait wait = new WebDriverWait(ChromeDriver, 3);
            ((ChromeDriver) ChromeDriver).findElementByXPath("//*[@id=\"gpn-header\"]/div[1]/div/div/div[3]/div/div[4]").click();
            wait.until(ExpectedConditions.titleIs("Sign in to gopro.com"));

            String Email="adedu@gopro.com";
            String password="H3nry443";
            ChromeDriver.findElement(By.cssSelector(("input[type='email']"))).sendKeys(Email);
            ChromeDriver.findElement(By.cssSelector(("input[type='password']"))).sendKeys(password + Keys.RETURN);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("i.icon.icon-profile"))).click();
            ChromeDriver.quit();
        }
}
