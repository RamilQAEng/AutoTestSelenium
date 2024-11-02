package Steps;

import Config.UserConf;
import Pages.SignIn;
import io.cucumber.java.en.Then;

public class ValidLoginSteps {

     SignIn sigin = new SignIn();

    @Then("Input login")
    public void inputLogin() {
        sigin.inputLogin(UserConf.USER_LOGIN);
    }

    @Then("Input Password")
    public void inputPassword() {
        sigin.inputPass(UserConf.USER_PASSWORD);
    }

    @Then("Click button")
    public void clickButton1() {
        sigin.clickButton();
    }

}