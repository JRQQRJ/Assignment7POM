package com.Swaglab.Pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsChekoutUserInfo extends BaseActions {

        WebDriver driver;


         public SwagLabsChekoutUserInfo(WebDriver driver){
             super(driver);
             this.driver=driver;
        }

        public void enterInformationAndCntinue(String fN, String lN, String zip) throws InterruptedException {
            typeInto("SwagLabsChekoutUserInfo.firstName",fN);
            typeInto("SwagLabsChekoutUserInfo.lastName",lN);
            typeInto("SwagLabsChekoutUserInfo.zip",zip);
            clickIt("SwagLabsChekoutUserInfo.btn_Continue");
            Thread.sleep(3000);
        }


    }


