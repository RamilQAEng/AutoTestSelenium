package Steps;

import Config.UserConf;
import Pages.SignIn;
import io.cucumber.java.en.Then;


public class MyStepdefs {

     SignIn sigin = new SignIn();

    @Then("Input login")
    public void inputLogin() {
        sigin.inputLogin(UserConf.USER_LOGIN);
    }

    @Then("Input Password")
    public void inputPassword() {
        sigin.inputPass(UserConf.USER_PASSWORD);
    }

    @Then("{string} button")
    public void button() {
        sigin.buttonClick();
    }
}