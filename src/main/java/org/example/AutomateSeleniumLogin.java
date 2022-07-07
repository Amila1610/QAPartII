package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateSeleniumLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Java_2022\\JDK, Maven\\EdgeDriver 103.0.1264.44\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/login.php");

        driver.switchTo().frame("gdpr-consent-notice");

        WebElement cookiesButton= driver.findElement(By.id("save"));
        cookiesButton.click();

        WebElement userName= driver.findElement(By.name("userName"));
        userName.sendKeys("test@gmail.com");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("password1!");

        WebElement buttonSubmit= driver.findElement(By.name("submit"));
        buttonSubmit.click();

        driver.close();
    }
}
