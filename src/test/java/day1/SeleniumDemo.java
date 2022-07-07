package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Java_2022\\JDK, Maven\\EdgeDriver 103.0.1264.44\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
