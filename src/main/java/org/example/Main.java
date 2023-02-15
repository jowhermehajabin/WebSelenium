package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/media/Programming/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Jowher");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Mehajabin");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1605");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

    }
}