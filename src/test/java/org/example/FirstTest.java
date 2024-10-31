package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FirstTest extends WebDriverSetting{

    @Test
    public void openBrowser() {

        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        assertEquals(title, "Swag Labs");

        WebElement login = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.id("password"));
        // Выполнение действия с элементом (например, клик)
        login.click();
        // Теперь мы можем заполнить форму данными
        login.sendKeys("standard_user1");
        pass.click();
        pass.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();

    }
}
