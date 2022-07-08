package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.List;

public class NewExample {

    public static void main(String[] args) throws InterruptedException {
        FirefoxOptions options;
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "C:\\Java_2022\\JDK, Maven\\geckodriver.exe");

        FirefoxProfile profile = new FirefoxProfile();
        File addblockefile= new File("C:\\Java_2022\\JDK, Maven\\adblock_plus-3.14.1.xpi");
        profile.addExtension(addblockefile);
        profile.setPreference("extensions.adblockplus.currentVersion", "2.4");
        options = new FirefoxOptions();
        options.setProfile(profile);
        driver=new FirefoxDriver(options);

        //maximize window
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");

        //Login with created user
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("aa");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("123456789");

        WebElement buttonSubmit= driver.findElement(By.name("submit"));
        buttonSubmit.click();

        //accept all cookies
        //Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        WebElement cookiesButton= driver.findElement(By.id("save"));
        cookiesButton.click();
        driver.switchTo().defaultContent();

        //back to home
        Thread.sleep(2000);
        driver.findElement(By.linkText("Home")).click();

        //Are tour tips displayed
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath(("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/" +
                "td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[1]/img"))).isDisplayed();
        System.out.println("Element displayed is :" + status);

        //navigate to Destination
        Thread.sleep(2000);
        driver.navigate().to("https://demo.guru99.com/test/newtours/support.php");

        String url=driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

        //back to home
        driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");

        //sign out
        //Check for element's presence
        List<WebElement> listOfElements = driver.findElements(By.linkText("SIGN-OUT"));

        System.out.println("Looking for button 'SIGN-OUT'....");

        if(listOfElements.size() != 0)
            System.out.println("Button 'SIGN-OUT' exist!!");
        else
            System.out.println("Button 'SIGN-OUT' doesn't exist! You're automatically out!! ");

        driver.quit();
    }

}
