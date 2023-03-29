package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First1 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.meoded.co.il/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");    //fix for Chrome version 111
        options.addArguments("--start-maximized");
//        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        Thread.sleep(3000);

        WebElement About = driver.findElement(By.className("nav-top-link"));
        About.click();
        Thread.sleep(3000);

        WebElement HomePage = driver.findElement(By.className("header_logo header-logo"));
        HomePage.click();
        Thread.sleep(3000);
        driver.close();
    }
}

