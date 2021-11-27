package com.Swaglab.Pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLogin extends BaseActions {

        public String URL = "https://www.saucedemo.com/";

        WebDriver driver;

        public SwagLabsLogin(WebDriver driver){
            super(driver);
            this.driver=driver;
        }


    public SwagLabsLogin enterUserName(String username){
        typeInto("SwagLabsLoginage.tbx_Username",username);
        return this;

    }

    public SwagLabsLogin enterPassword(String password){
        typeInto("SwagLabsLoginPage.tbx_Password",password);
        return this;

    }

    public SwagLabsInventory clickLogin(){
        clickIt("SwagLabsLoginPage.tbx_btn_Submit");
        return new SwagLabsInventory(driver);

    }



    }


