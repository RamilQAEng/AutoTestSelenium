package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignIn {
   private final SelenideElement logInp = $(By.cssSelector("#user-name"));
   private final SelenideElement passInp = $(By.cssSelector("#password"));

   public void inputLogin (String text) {
       this.logInp.val(text);
   }
   public void inputPass (String text) {
       this.passInp.val(text);
   }
   public void buttonClick() {
       Selenide.$(By.cssSelector("#login-button")).click();
   }

}

