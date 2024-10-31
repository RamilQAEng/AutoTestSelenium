package org.example;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }


}
