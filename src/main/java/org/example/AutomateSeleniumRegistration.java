package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateSeleniumRegistration {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Java_2022\\JDK, Maven\\EdgeDriver 103.0.1264.44\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        driver.switchTo().frame("gdpr-consent-notice");

        WebElement cookiesButton= driver.findElement(By.id("save"));
        cookiesButton.click();

        WebElement firstName= driver.findElement(By.name("firstName"));
        firstName.sendKeys("String");

        WebElement lastName= driver.findElement(By.name("lastName"));
        lastName.sendKeys("String");

        WebElement phoneNum= driver.findElement(By.name("phone"));
        phoneNum.sendKeys("+38766123123");

        WebElement email= driver.findElement(By.name("userName"));
        email.sendKeys("test1@gmail.com");

        WebElement address= driver.findElement(By.name("address1"));
        address.sendKeys("String 20");

        WebElement city= driver.findElement(By.name("city"));
        city.sendKeys("String");

        WebElement state= driver.findElement(By.name("state"));
        state.sendKeys("State");

        WebElement postalCode= driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("71000");

        WebElement country= driver.findElement(By.name("country"));
        postalCode.sendKeys("ALBANIA");

        WebElement userName= driver.findElement(By.name("email"));
        userName.sendKeys("test1@gmail.com");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("password1!");

        WebElement confirmPassword= driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("password1!");

        WebElement buttonSubmit= driver.findElement(By.name("submit"));
        buttonSubmit.click();

        driver.close();


    }
}
