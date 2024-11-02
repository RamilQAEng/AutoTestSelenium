package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class SignIn {
    private final SelenideElement logInp = $(By.id("user-name"));
    private final SelenideElement passInp = $(By.id("password"));
    private final SelenideElement buttonCl = $(By.id("login-button"));

    public void inputLogin(String text) {
        this.logInp.val(text);
    }

    public void inputPass(String text) {
        this.passInp.val(text);
    }

    public void clickButton() {
        this.buttonCl.click();
    }
}



