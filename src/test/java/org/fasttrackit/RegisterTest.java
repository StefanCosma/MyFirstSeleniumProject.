package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test

    public void Register() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement Register = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        Register.click();


        driver.findElement(By.id("firstname")).sendKeys("Pac");
        driver.findElement(By.id("lastname")).sendKeys("Fanica");
        driver.findElement(By.name("email")).sendKeys("cosma.stefan@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmation")).sendKeys("123456");
        driver.findElement(By.name("is_subscribed")).click();


        driver.quit();


    }
}