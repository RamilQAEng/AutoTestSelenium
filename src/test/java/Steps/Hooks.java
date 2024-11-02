package Steps;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {
     @Before
    public void openUrl() throws InterruptedException {
         open("https://www.saucedemo.com/");
         Thread.sleep(2000);// лучше сделать проверку через assert

     }
}


