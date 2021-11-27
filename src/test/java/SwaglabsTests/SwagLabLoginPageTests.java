package SwaglabsTests;

import com.Swaglab.Pages.*;
import com.automationbytarun.components.DataProviderArgs;
import com.automationbytarun.components.DataProviderUtils;
import com.automationbytarun.components.TestActions;
import com.automationbytarun.helpers.DataGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Objects;

public class SwagLabLoginPageTests extends TestActions {


    @DataProviderArgs("validateLoginFunctionality=username,password,item1,item2,firstname,lastname,zip")
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = "jsonDataProvider")
    public void validateLoginFunctionality(String username, String password, String item1, String item2, String firstname, String lastname, String zip) throws InterruptedException {

        SwagLabsLogin swagLabsLogin = new SwagLabsLogin(driver.get());
        swagLabsLogin.enterUserName(username);
        swagLabsLogin.enterPassword(password);
        swagLabsLogin.clickLogin();
        SwagLabsInventory swagLabsInventory = new SwagLabsInventory(driver.get());
        if (Objects.equals(item1, "SauceLabsBackpack")) {
            swagLabsInventory.clickAddToCartItem1();
        }
        if (Objects.equals(item2, "SauceLabsFleeceJacket")) {
            swagLabsInventory.clickAddToCartItem2();
        }
        swagLabsInventory.checkpoint1();
        swagLabsInventory.clickOnCartIcon();
        SwagLabsCart swagLabsCart = new SwagLabsCart(driver.get());
        swagLabsCart.checkPoint3();
        swagLabsCart.checkOut();
        SwagLabsChekoutUserInfo swagLabsChekoutUserInfo = new SwagLabsChekoutUserInfo(driver.get());
        swagLabsChekoutUserInfo.enterInformationAndCntinue(firstname,lastname,zip);
        SwagLabsCheckout swagLabsCheckout = new SwagLabsCheckout(driver.get());
        swagLabsCheckout.checkPoiny4();
        swagLabsCheckout.clickFinishButton();


    }
}
