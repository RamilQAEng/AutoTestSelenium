package Steps;

import Config.UserConf;
import Pages.SignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidLoginSteps {

    SignIn InvSigin = new SignIn();

    @Then("Input invlaid login")
    public void inputInvlaidLogin() {
        InvSigin.inputLogin(UserConf.USER_LOG);
    }

    @Then("Input invalid Password")
    public void inputInvalidPassword() {
        InvSigin.inputPass(UserConf.USER_PASS);
    }

    @And("Click button now")
    public void clickButtonNow() {
        InvSigin.clickButton();
    }
}
