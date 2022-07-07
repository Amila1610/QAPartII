package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

    public static void main(String[] args) /*throws Exception*/ {

        System.setProperty("webdriver.edge.driver", "C:\\Java_2022\\JDK, Maven\\EdgeDriver 103.0.1264.44\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");

        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        String expectedTitle ="Mercury Tours";
        System.out.println(expectedTitle);

        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title matched");
        else
            System.out.println("Title didn't match");


        driver.close();
        driver.quit();

        /*try {
            driver.navigate().to("https://bing.com");

            WebElement element = driver.findElement(By.id("sb_form_q"));
            element.sendKeys("WebDriver");
            element.submit();

            Thread.sleep(5000);
        } finally {
            driver.quit();
        }*/
    }
}
